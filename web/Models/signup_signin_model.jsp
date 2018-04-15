<%-- 
    Document   : signup_signin_model
    Created on : 13 avr. 2018, 23:11:12
    Author     : Yagoubi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

    </head>
    <body>
          <div id="loginModal" class="modal fade" role="dialog">
            <div class="modal-dialog modal-md " role="content">
                <div class="modal-content bg-inverse text-white">
                    <div class="modal-header">

                        <ul class="nav nav-tabs" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="tab"id="signup_link"  href="#signup" role="tab">Sign Up</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="tab" href="#signin"id="login_link"  role="tab">Sign In</a>
                            </li>
                        </ul>
                        <button type="button" class="close text-white" data-dismiss="modal">&times;</button>

                    </div>
                    <div class="tab-content">
                         <div class=" tab-pane" id="signup" role="tabpanel">

                             <%@include file="../Forms/SignUp.jsp" %>
                             
                    </div>
                    <div class="tab-pane card-body " id="signin" role="tabpanel">
                        <%@include file="../Forms/Signin.jsp" %> 
                    </div>           

                    </div>
                   
                </div>
            </div>


        </div>
    </body>
</html>
