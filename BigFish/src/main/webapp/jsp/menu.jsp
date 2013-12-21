<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

  <!-- Main menu (tabs) -->
     <div id="tabs" class="noprint">

            <h3 class="noscreen">Navigation</h3>
            <ul class="box">
				<li id="active"><a href="#">Home<span class="tab-l"></span><span class="tab-r"></span></a></li>
                <li><a href="#">Admin<span class="tab-l"></span><span class="tab-r"></span></a></li>
                <li><a href="#">Dashboard<span class="tab-l"></span><span class="tab-r"></span></a></li> <!-- Active -->
                <li><a href="#">Change<span class="tab-l"></span><span class="tab-r"></span></a></li>
                <li><a href="#">Task/Ticket<span class="tab-l"></span><span class="tab-r"></span></a></li>
                <li><a href="#">Report<span class="tab-l"></span><span class="tab-r"></span></a></li>
                <li><a href="#">Key Contacts<span class="tab-l"></span><span class="tab-r"></span></a></li>
            </ul>

        <hr class="noscreen" />
     </div> <!-- /tabs -->

    <!-- Page (2 columns) -->
    <div id="page" class="box">
    <div id="page-in" class="box">

    <div id="strip" class="box noprint">
           
            <!-- RSS feeds 
            <p id="rss">
            		  <a href="#">Notifications</a> / <a href="#">IT News</a> /  
			</p>-->
			
			<!-- Logout -->
               		  <sec:authorize var="loggedIn" access="isAuthenticated()" />
               		  <c:choose>
	   				  <c:when test="${loggedIn}">
         				  <p id="logout">  <a href="<c:url value="/j_spring_security_logout"/>">Logout</a>  </p>
	   				  </c:when>
	   				  <c:otherwise>
	   				     <p id="rss">
            		 			 <a href="#">Notifications</a> / <a href="#">IT News</a> 
						</p>
	   				  </c:otherwise>
	   				  </c:choose>
	       
            <hr class="noscreen" />

            <!-- Breadcrumbs -->
            <p id="breadcrumbs">You are here: <a href="#">Home</a> &gt; <a href="#">Category</a> &gt;  <strong>Page</strong></p>
            <hr class="noscreen" />
            
        </div> <!-- /strip -->
        
    