<%-- 
    Document   : Signin
    Created on : 6 avr. 2018, 03:11:24
    Author     : Yagoubi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        
                  
                    <div class="container">
                          
                            
                        <div class="row">
                            <br>
                            <div class="col">
                                <h2>Hello and Welcome!</h2>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col">
                                <form class="container-fliud" id="signin_form">       
                                    <div class="row">
                                        <div class="col-12">
                                            <label>Email*</label>
                                        </div>
                                        <div class="col-12">
                                            <input type="email"class="form-control" id="email_signin" placeholder="Email*">
                                            <br>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-12">
                                            <label>Password*</label>
                                        </div>
                                        <div class="col-12">
                                            <input type="password" class="form-control" id="password_signin" placeholder="Password*">
                                            <br>
                                        </div>
                                    </div>
                                   

                                    <div class="row">
                                        <div class="col-12">
                                            <button class="btn btn-primary btn-block" id="submit_signin" type="button">Sign In</button>
                                            <span class="error_in"></span>
                                        </div>
                                    </div>
                                    <br>

                                </form>
                            </div>
                        </div>

                    </div>

               
    </body>
    </body>
</html>
