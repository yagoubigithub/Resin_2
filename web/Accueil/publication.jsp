<%-- 
    Document   : publication
    Created on : 9 avr. 2018, 06:27:53
    Author     : Yagoubi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
         <div class="card">
                            <div class="card-body">
                                <div class="row">
                                    <div class="col">
                                        <img src="../images/avatar2.png" width="50" height="50"class="rounded-circle float-left user_image_pub">
                                        <h6 class="user_name_pub">hello </h6> 
                                    </div>

                                </div>
                                <br>
                                <div class="row">
                                    <div class="col">
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col">
                                        <img src="../images/back2.1.jpg" class="img-thumbnail">
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col">
                                        <script>
                                            function loadDoc() {
                                            var xhttp = new XMLHttpRequest();
                                            xhttp.onreadystatechange = function () {
                                                if (this.readyState == 4 && this.status == 200) {
                                                    alert(this.responseText);
                                                }
                                            };
                                            xhttp.open("GET", "test.jsp", true);
                                            xhttp.send();
                                        }
                                        </script>
                                        <button type="button" class="btn" onclick="loadDoc()"><i class="fa fa-thumbs-up"></i> Like</button>
                                        
                                        <button type="button" class="btn"><i class="fa fa-comment"></i> Comment</button>
                                    </div>
                                </div>  
                                <br>
                            </div>
                            <div class="card-footer">
                                <img src="../images/avatar5.png" width="50" height="50"class="rounded-circle float-left user_image_pub">
                                <h6 class="user_name_pub">AJAX allows web pages to be updated asynchronously by exchanging data with a web server behind the scenes. This means that it is possible to update parts of a web page, without reloading the whole page</h6> 
                                <img src="../images/avatar3.png" width="50" height="50"class="rounded-circle float-left user_image_pub">
                            <textarea class="form-control form-control-sm" rows="2" cols="5"></textarea>
                            </div>

                        </div>
    </body>
</html>
