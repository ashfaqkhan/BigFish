<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s"  uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

 <!-- Content -->
 <div id="content">
 <div class="article">
 	<h2><span><a href="#">BigFish Login</a></span></h2></br>
 

<%  String action_message = request.getParameter("login_action");   %>
<c:set var="action" scope="page" value="<%=action_message%>"/>


	<sec:authorize var="loggedIn" access="isAuthenticated()" />
	   
	   <c:choose>
         <c:when test="${loggedIn}">
           <div class="errorblock"> You are already loged in : <a href="<c:url value="/login/loginController.action?message=success"/>">click here</a>
            to go user dashboard
           </div>
		</c:when>
    	<c:otherwise>
    				<c:choose>
    					<c:when test="${action == 1}">
	  						<font color='red'>Your login attempt was not successful, try again. </font> <br> 
		 					<div class="errorblock"> Caused :  ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message} </div> 
						</c:when>
   						<c:when test="${action == 2}">
   						 <div class="errorblock"> You are now successfully logout!... </div> <br>	
   																				
   						</c:when>
   						<c:otherwise>
       					   <!-- No action sir  -->
   						 </c:otherwise>
   					</c:choose>
				      
					<form action="<c:url value='${pageContext.request.contextPath}/j_spring_security_check' />" name="f" method="post">
						<table>
							<tr><td>User:</td><td><input type='text' name='j_username' value='' size="12"></td></tr>
							<tr><td>Password:</td><td><input type='password' name='j_password' size="12" /></td></tr>
							<tr>
				 				<td colspan="2"><input type='checkbox' name='_spring_security_remember_me'/>
								Remember me &nbsp; <s:fielderror fieldName="_spring_security_remember_me" /></td>
							</tr>
							<tr>
								<td><input name="submit" type="submit"	value="submit" /></td>
								<td><input name="reset" type="reset" /></td>
							</tr>
						</table>
					</form>
		</c:otherwise>
	   </c:choose>
</div>
</div>