package com.mvcproject.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mvcproject.model.Student;


@Controller
public class StudentAdmissionController {

	@RequestMapping(value="/admissionForm",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm()
	{
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}
	
	@RequestMapping(value="/submitAdmissionForm",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1") Student student1,BindingResult result)
	{
		if(result.hasErrors())
		{
			ModelAndView model = new ModelAndView("AdmissionForm");
			return model;		
		}
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		return model;		
	}
	
	/**
	 * Inorder to prevent spring from automatically binding you can do custom binding to fields
	 * Instead of default date we use custom dateformat.
	 * @param binder
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat,false));
	}
	
	/**
	 * All Common attributes for different actions can be put here 
	 * @param model1
	 */
	@ModelAttribute
	public void addingCommonObjects(Model model1)
	{
		model1.addAttribute("headerMsg", "Admission Form For Undergraduates");
		model1.addAttribute("successMsg", "Student Details Submitted Successfully");
	}
	
}
