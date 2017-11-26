# Spring-i18n
Spring Spring internationalization

Spring i18n
maven
	<!-- jstl��ǩ -->  
	<dependency>    
	    <groupId>javax.servlet</groupId>    
	    <artifactId>jstl</artifactId>    
	    <version>1.2</version>    
	    <scope>runtime</scope>    
	</dependency>  
	<dependency>  
	    <groupId>taglibs</groupId>  
	    <artifactId>standard</artifactId>  
	    <version>1.1.2</version>  
	</dependency>
	<dependency>
	    <groupId>javax.servlet.jsp</groupId>
	    <artifactId>jsp-api</artifactId>
	    <version>2.2</version>
	    <scope>provided</scope>
	</dependency>

applicationContext-basic.xml
 <!-- i18n ���ʻ����� -->
   <bean id="messageSource" class="org.springframework.context.support.ReloadableResourceBundleMessageSource">
   	<property name="basenames">
   		<list>
   			<value>classpath:i18n/messages</value>
			<value>classpath:i18n/messages</value>
   		</list>
   	</property>
   </bean>
   
   <!-- ʵ����Ϣ�ı��ػ� http://blog.csdn.net/biren_wang/article/details/52254823 -->
   <bean id="localeResolver" class="org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver"></bean>

index.jsp
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<spring:message code="greetings"/>
