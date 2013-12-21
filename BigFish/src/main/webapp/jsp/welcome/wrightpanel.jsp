<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

 <!-- Right column -->
        <div id="col" class="noprint">
        <div id="col-in">
 		<h3 ><span>Login to BigFish</span></h3>
			<form action="<c:url value='${pageContext.request.contextPath}/j_spring_security_check' />" name="f" method="post">
			<table>
				<tr><td>User:</td><td><input type='text' name='j_username' value='' size="12"></td></tr>
				<tr><td>Password:</td><td><input type='password' name='j_password' size="12" /></td></tr>
				<tr>
					<td colspan="2"><input type='checkbox' name='_spring_security_remember_me'/>
						Remember me &nbsp; <s:fielderror fieldName="_spring_security_remember_me" />
					</td>
				</tr>
				<tr>
					<td><input name="submit" type="submit"	value="submit" /></td>
					<td><input name="reset" type="reset" /></td>
				</tr>
			</table>
			</form>
		
					
                <!-- Category -->
                <h3 ><span>Notifications</span></h3>

                <ul id="notifications">
                    <li><a href="#">Category</a></li>
                    <li><a href="#">Category</a></li>
                    <li><a href="#">Category</a></li>
                    <li><a href="#">Category</a></li>
                </ul>

                <hr class="noscreen" />

                <!-- Archive -->
                <h3><span>Latest IT News</span></h3>
                <ul id="archive">
                   <li><a href="#">January 2007</a></li>
                    <li><a href="#">December 2006</a></li>
                    <li><a href="#">November 2006</a></li>
                    <li><a href="#">October 2006</a></li>
                    <li><a href="#">September 2006</a></li>
                 </ul>

                <hr class="noscreen" />
            
            </div> <!-- /col-in -->
        </div> <!-- /col -->
       
 	