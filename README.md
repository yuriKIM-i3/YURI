# Issue Maker
GitHubのIssueページを自ら作ってみることによって、様々な機能を身に付ける


## Technologies
* Vagrant 2.2.5
* putty 0.70
* Linux(Centos7)
* Samba 4.8.3
* Bootstrap 4
* JSP 2.3
* Gradle 5.4.1
* Spring Boot 2.1.4
* Java 1.8.0
* MySql 5.7.27
* Mybatis 3.5.0

## General info
Issue Makerはユーザー登録、Issue作成、Label作成の機能を作る予定です

## Features
* 개발환경 부분 開発環境に関して
  * 베이그란트로 가상머신 관리 Vagrantで仮想機械を構築
  * 푸티이용해서 가상머신에 ssh접속 Puttyを活用してLinuxにSSH接続
  * 삼바 파일 공유를 이용한 개발환경 셋팅　 Sambaでファイル共有を利用した開発環境セッティング
  * 깃허브로 코드의 버전관리 GitHubでコードのバージョンを管理
    * .gitignoreでいらないコードは挙げないようにする
    * pull request作成　そして、チーム員とのレビュー
  * Gradleでビルド自動化
* 프로그래밍 부분 プログラミングに関して
  * ユーザー
    * 스프링부트의 웹시큐리티로 로그인 관리 Spring Boot Securityでログイン機能を動作させる
    * 비밀번호 암호화 기능   暗号番号を暗号化
    * user에 대한 validation 기능  ユーザー登録をする場合、validationで文字の長さや空欄を検査
    * custom validation (이 있는 커밋 링크)  custom validationでメールとネームの重複チェック機能を実装
  
## Screenshots
* ユーザー登録をする時のvalidationチェック

* パスワード再入力が間違った場合

* ログイン

* 既にあるメールとネームで登録をする場合

## Status
Project is: _作業中_

## Inspiration
GitHubのIssue部分を参考して開発している

## Contact
Created by [@Yuri KIM](https://www.flynerd.pl/) - feel free to contact me!
