# kopring
[초급] 맛보자! 코틀린과 스프링으로 API 호출하기


1.1
![image](https://github.com/seunghyun333/kopring/assets/128073991/35a4322a-4b2a-4a29-9720-6e95671b579c)


1.2
변수 알아보기

1.3
if와 when 알아보기

1.4
function 알아보기

1.5
class와 interface 알아보기 



2.0
MariaDB 대신 MySQL 사용
2.1
간단한 sql CRUD

3.0
프로젝트 준비
plugins {
	id("org.springframework.boot") version "3.0.6"
	id("io.spring.dependency-management") version "1.1.0"
	kotlin("jvm") version "1.7.22"
	kotlin("plugin.spring") version "1.7.22"
	kotlin("plugin.jpa") version "1.7.22"
}
<img width="1371" alt="image" src="https://github.com/seunghyun333/kopring/assets/128073991/06936de0-db99-42f5-b8f3-3dd5766a284a">

annotation 옵션 추가 



4.0 
API 만들기 


4.0 
API 만들기
- kakao Developers 써보기
- DTO 만들기
- Entity 만들기
- Repository 만들기
- Service 만들기
- Controller 만들기 
- WebClient로 카카오API 호출하기  (Maven Repository 이용)
<img width="1199" alt="image" src="https://github.com/seunghyun333/kopring/assets/128073991/01c79882-57c2-48c0-9246-9eb965b3535e">
- ExceptionHandler 만들기
- validation 추가하기
- 검색어 순위 추가하기
