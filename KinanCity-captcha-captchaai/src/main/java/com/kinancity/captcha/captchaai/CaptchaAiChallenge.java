package com.kinancity.core.captcha.captchaai;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class CaptchaAiChallenge {

	/**
	 * Id of the CaptchaAi request
	 */
	private String captchaId;

	/**
	 * When was it first sent
	 */
	private LocalDateTime sentTime;

	/**
	 * How many times we tried to get it from CaptchaAi
	 */
	private int nbPolls;

	public CaptchaAiChallenge(String captchaId) {
		this.captchaId = captchaId;
		this.sentTime = LocalDateTime.now();
	}
}
