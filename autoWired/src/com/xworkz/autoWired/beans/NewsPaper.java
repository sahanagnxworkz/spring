package com.xworkz.autoWired.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	@Autowired
	@Qualifier("newsPaperId")
	private int id;
	@Autowired
	@Qualifier("newsPaperName")
	private String name;
	@Autowired
	@Qualifier("newsPaperLang")
	private String ownerName;
	@Autowired
	@Qualifier("newsPaperLang")
	private String lang;
	@Autowired
	@Qualifier("newsPaperPrice")
	private double price;

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", lang=" + lang + ", price="
				+ price + "]";
	}

}
