

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="../css/bootstrap.min.css">
        <link rel="stylesheet" href="../css/fontawesome-free-5.0.12/web-fonts-with-css/css/fontawesome-all.min.css">
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
            .i1{
                color:red;
            }
            .i0{
                color:#111;
            }
        </style>
    </head>
    <body>
        <%
            String firstname = "";
            String city = "";
            String tel = "";
            String user_id="";
            try {
                city = session.getAttribute("city_id").toString();
                firstname = session.getAttribute("firstname").toString();
                tel = session.getAttribute("tel").toString();
                user_id = session.getAttribute("user_id").toString();
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

                        <li class="nav-item"><a href="../Profil/myProfil.jsp" class="nav-link"><span class="fa fa-address-card fa-lg"></span> My Profil</a></li>

                    </ul>
                </div>
                <form>


                    <div class="input-group">
                        <div class="input-group-btn">
                            <button type="button" class="btn btn-outline-success dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                All
                            </button>
                            <div class="dropdown-menu" id="menu-categorie">
                                ..........
                            </div>
                        </div>
                        <input type="text" class="form-control" aria-label="Text input with dropdown button">
                        <div class="input-group-btn">
                            <button type="button" class="btn btn-outline-success">Serch</button>
                        </div>
                    </div>
                </form>
                <div class="identity text-white">

                    <button class="btn btn-outline-success ml-5" type="button" id="logout">Log Out</button>


                </div>
            </div>
        </nav>
        <br>

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
                                <p> <%= tel%> </p> 
                            </div>
                        </div>
                    </div>
                    <div class="col-sm" >
                        <br>
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Create Pub</h4>
                                <div class="form-group">
                                    <form action="../FileUploadServlet1" id="upload-form" method="post" enctype="multipart/form-data">
                                        <input class="form-control mb-2" id="nom_a" name="nom_a" placeholder="Nom de larticle ..">
                                        <input class="form-control mb-2" id="prix" placeholder="Prix">
                                        <input type="file" id="file_input" name="file" class="form-control mb-2" >

                                        <textarea class="form-control" id="myTextarea" rows="3">Detail ..</textarea>
                                </div>
                                <button type="button" class="btn btn-info" id="post">Post</button>
                                </form>

                            </div>
                        </div>
                        <br>
                        <div id="publication">
                            <%@include  file="publication.jsp" %>
                        </div>



                    </div>

                    <div class="col-sm-2">

                    </div>
                </div>
            </div>
        </div>

        <script src="../js/jquery.min.js"></script>
        <script src="../js/jquery.form.js"></script>
        <script src="../js/tether.min.js"></script>
        <script src="../js/bootstrap.min.js"></script>
        <script src="../js/validation/logout.js"></script>
        <script src="../js/fechBD/fetch_categorie.js"></script>
        <script src="../js/fechBD/fetch_publication.js"></script>
        <script src="../js/Like_and_Comment/like.js"></script>
        <script src="../js/PUBL/send_publication.js"></script>
    </body>
</html>
