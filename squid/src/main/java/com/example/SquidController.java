package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dao.SquidResultDao;
import com.example.entity.SquidRecord;
import com.example.form.SaveResultForm;
import com.example.service.SquidService;

@Controller
public class SquidController {


	@Autowired
	SquidService service;

	@Autowired
	SquidResultDao dao;

	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("saveResultForm")  SaveResultForm form) {

		SquidRecord entity = new SquidRecord();
		entity.setStage(form.getStage());
		entity.setKillCount(form.getKillCount());
		entity.setDeathCount(form.getDeathCount());
		entity.setResultFlg(form.getResultFlg());

		dao.insert(entity);
		//service.insertSquidData(entity);

		return "content/saveResult";
	}



	@RequestMapping(path = "/history", method = RequestMethod.GET)
	public String history(Model model) {

		model.addAttribute("squidResultList", dao.selectAll());
		return "content/content";
	}

	@RequestMapping(path = "/savepage", method = RequestMethod.GET)
	public String savePage(Model model) {
		model.addAttribute("saveResultForm", new SaveResultForm());
		return "content/saveResult";
	}

}
