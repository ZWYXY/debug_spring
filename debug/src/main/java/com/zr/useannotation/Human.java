package com.zr.useannotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 测试 @PostConstruct 和 @PreDestroy
 *
 * @author zhourui
 * @date 2022/1/10 15:35
 */

@Component
public class Human {

	private Integer country;

	private String liveLocation;

	@PostConstruct
	public void init() {
		System.err.println("init ....");
	}

	@PreDestroy
	public void destroy() {
		System.err.println("destroy ....");
	}


	public Integer getCountry() {
		return country;
	}

	public void setCountry(Integer country) {
		this.country = country;
	}

	public String getLiveLocation() {
		return liveLocation;
	}

	public void setLiveLocation(String liveLocation) {
		this.liveLocation = liveLocation;
	}
}
