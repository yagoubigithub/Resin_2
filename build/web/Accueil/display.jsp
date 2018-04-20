

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="../css/bootstrap.min.css">
        <title>Resin</title>
        <style>
            .card{
                padding:10px;
            }
            .user_name_pub{
                margin-top:14px;

            }
            .user_image_pub{
                margin-right: 15px;
            }
        </style>
    </head>
    <body>
        <%
            String firstname = "";
            String city = "";
            String address = "";
            try {
                city = session.getAttribute("city_id").toString();
                firstname = session.getAttribute("firstname").toString();
                address = session.getAttribute("address").toString();
            } catch (Exception e) {
            }
        %>
        <nav class="navbar navbar-inverse navbar-toggleable-sm bg-inverse fixed-top">

            <div class="container">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#Navbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <a href="index.jsp" class="navbar-brand"><h4>Resin</h4></a>

                <div class="collapse navbar-collapse" style="width:50%" id="Navbar">
                    <ul class="navbar-nav ">

                        <li class="nav-item "><a href="#" class="nav-link"><span class="fa fa-home fa-lg"></span> Catalogue</a></li>
                        <li class="nav-item active"><a href="#" class="nav-link"><span class="fa fa-info fa-lg"></span> Accueil</a></li>

                        <li class="nav-item"><a href="#" class="nav-link"><span class="fa fa-address-card fa-lg"></span> My Profil</a></li>

                    </ul>
                </div>
                <div class="input-group">
                    <div class="input-group-btn">
                        <button type="button" class="btn btn-outline-success dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            All
                        </button>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="#">Action</a>
                            <a class="dropdown-item" href="#">Another action</a>
                            <a class="dropdown-item" href="#">Something else here</a>
                            <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                    </div>
                    <input type="text" class="form-control" aria-label="Text input with dropdown button">
                    <div class="input-group-btn">
                        <button type="button" class="btn btn-outline-success">Serch</button>
                    </div>
                </div>
                <div class="identity text-white">
                    
                        <button class="btn btn-outline-success ml-5" type="button" id="logout">Log Out</button>
                    

                </div>
            </div>
        </nav>

        <div class="jumbotron">
            <div class="container-fliud">
                <div class="row">
                    <div class="col-sm-3">
                        <div class="card">
                            <div class="card-body  text-center">
                                <h3> <%=firstname%></h3>

                                <img src="../images/avatar3.png"  width="100" height="100"class="rounded-circle">
                                <br>

                            </div>
                            <div class="card-body">
                                <p> <%=firstname%> </p> 
                                <p> <%= city%> </p> 
                                <p> <%= address%> </p> 
                            </div>
                        </div>
                    </div>
                    <div class="col-sm">
                        <%@include  file="publication.jsp" %>
                        <br>
                        <%@include  file="publication.jsp" %>

                    </div>

                    <div class="col-sm-2">

                    </div>
                </div>
            </div>
        </div>

        <script src="../js/jquery.min.js"></script>
        <script src="../js/tether.min.js"></script>
        <script src="../js/bootstrap.min.js"></script>
        <script src="../js/validation/logout.js"></script>
    </body>
</html>
