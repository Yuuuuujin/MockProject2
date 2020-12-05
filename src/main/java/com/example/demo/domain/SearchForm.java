package com.example.demo.domain;

import java.util.Date;

import lombok.Data;

/**
 * 社員情報検索 form
 * @version 1.0
 * @author upl_member
 */
@Data
public class SearchForm {

	// 社員番号
	private String empId;

	// 氏名
	private String empName;

	// フリガナ
	private String empKana;

	// 所属部署
	private String affi;

	// 役職
	private String empTitle;

	// 連絡先
	private String contact;

	// メールアドレス
	private String email;

	// 入社日
	private Date dateEmp;

}