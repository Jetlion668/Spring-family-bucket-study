package com.southwind.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileHandler {
	
	    @RequestMapping(value="/upload", method = RequestMethod.POST)
	    public String upload(@RequestParam(value="img")MultipartFile img, HttpServletRequest request)
	            throws Exception {
	        //getSize()方法获取文件的大小来判断是否有上传文件
	        if (img.getSize() > 0) {
	            //获取保存上传文件的file文件夹绝对路径
	            String path = request.getSession().getServletContext().getRealPath("file");
	            //获取上传文件名
	            String fileName = img.getOriginalFilename();
	            File file = new File(path, fileName);
                img.transferTo(file);
                //保存上传之后的文件路径
                request.setAttribute("filePath", "file/"+fileName);
                return "upload";
	        }
	        return "error";
	    }
	
	    @RequestMapping(value="/uploads", method = RequestMethod.POST)
	    public String uploads(@RequestParam MultipartFile[] imgs, HttpServletRequest request)
	            throws Exception {
	    	//创建集合，保存上传后的文件路径
	    	List<String> filePaths = new ArrayList<String>();
	        for (MultipartFile img : imgs) {
	            if (img.getSize() > 0) {
	                String path = request.getSession().getServletContext().getRealPath("file");
	                String fileName = img.getOriginalFilename();
	                File file = new File(path, fileName);
	                filePaths.add("file/"+fileName);
                    img.transferTo(file);
	            }
	        }
	        request.setAttribute("filePaths", filePaths);
	        return "uploads";
	    }
	    
	    @RequestMapping("/download")
	    public void downloadFile(String fileName,HttpServletRequest request,
	          HttpServletResponse response){
	       if(fileName!=null){
	    	//获取file绝对路径
	        String realPath = request.getServletContext().getRealPath("file/");
	        File file = new File(realPath,fileName);
	        OutputStream out = null;
	        if(file.exists()){
		         //设置下载完毕不打开文件 
		         response.setContentType("application/force-download");
		         //设置文件名 
		         response.setHeader("Content-Disposition", "attachment;filename="+fileName);
		         try {
		           out = response.getOutputStream();
		           out.write(FileUtils.readFileToByteArray(file));
		           out.flush();
		         } catch (IOException e) {
		           // TODO Auto-generated catch block
		           e.printStackTrace();
		         }finally{
		        	 if(out != null){
		        		 try {
							out.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		        	 }
		         }                    
	         }           
	      }           
	   }
}

