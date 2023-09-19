# WebAlarmService
웹 사이트 내 알람 기능 서비스

- 팀 명: 일찍 일어나조
- 팀원 : 박정민
- 팀 주제: 알람 기능 웹 사이트
- 사용 기술 : Java(언어), Spring boot(프레임 워크), JPA, Thymeleaf(View), Junit(테스트), Git(버전 관리)
- Tool : IntelliJ IDEA
- Database : MariaDB
- 버전 관리 방법: 버전은 [커밋 컨벤션 규칙](https://velog.io/@shin6403/Git-git-%EC%BB%A4%EB%B0%8B-%EC%BB%A8%EB%B2%A4%EC%85%98-%EC%84%A4%EC%A0%95%ED%95%98%EA%B8%B0)에 맞추어 기능 별로 커밋하도록 한다.

# 프로젝트 개요

사용자가 원하는 알람 시간을 입력(등록)하고,

설정한 상세 내용을 살펴보고,

해당 정보를 수정 할 수 있으며,

필요 없어지면 삭제할 수 있다.

등록한 알람 전체 항복을 보기 위한 목록 기능도 필수

기초적인 CRUD 기능 구현을 목표로 하고 시간이 남는다면 추가하고 싶은 기능 구현 예정이다.

## setting & dependency

- maven
- swagger
- Developer Tools : Spring Boot DevTools, Lombok, Spring Configuaration Processor
- Web: Spring Web
- Template Engines : Thymeleaf
- SQL: Spring Data JPA, Maria Driver
