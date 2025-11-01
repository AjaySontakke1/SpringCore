package com.Sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class GetSeason {
	@Autowired
	public LocalDateTime ldt;
	public String getseason() {
		int month=ldt.getMonthValue();
		if(month>=6&&month<=9) {
			return "Season is Mansoon";
		}else if(month>=2&&month<=4) {
			return "Season is Summer";
		}else {
			return "Season is Wintor";
		}
	}
}
