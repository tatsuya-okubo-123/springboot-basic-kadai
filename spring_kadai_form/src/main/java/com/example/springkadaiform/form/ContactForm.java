package com.example.springkadaiform.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ContactForm {
	//名前
	@NotBlank(message = "お名前を入力してください。")
	private String name;
	
	//メール
	@NotBlank(message = "メールアドレスを入力してください。")
	@Email(message = "メールアドレスの入力が正しくありません。")
	private String email;
	
	//メッセージ
	@NotBlank(message = "お問い合わせ内容を入力してください。")
	private String message;
}