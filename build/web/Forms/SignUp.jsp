
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <div class=" container">
            <br>
            <div class="row">
                <div class="col">
                    <form class="container-fliud" id="myForm" action="Accueil/display.jsp" method="POST">
                        <div class="row">
                            <div class="col">
                                <input type="text" class="form-control" id="firstname" name="firstname" placeholder="First Name*" >
                                <span class="error">error_description</span>
                            </div>
                        </div>
                        <div class="row ">
                            <div class="col">
                                <input type="text" class="form-control" id="lastname" name="lastname" placeholder="Last Name*">
                                <span class="error">error_description</span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col">
                                <input type="email"class="form-control" id="email" name="email" placeholder="Email*">
                                <span class="error">error_description</span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col">
                                <input type="password" class="form-control" id="password" name="password"placeholder="Password*">
                                <span class="error">error_description</span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col">
                                <input type="password" class="form-control" id="confirmpassword" name="confirmpassword" placeholder="Confirm Password*">
                                <span class="error">error_description</span>
                            </div>
                        </div>
                        <div class="row ">
                            <div class="col">
                                <input type="text" class="form-control" id="tel" name="tel" placeholder="Tel..*" >
                                <span class="error">error_description</span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col">
                                <select name="city" id="city" class="form-control">
                                    <option value="">city</option>
                                    <option value="Alger">Alger</option>
                                    <option value="Oran">Oran</option>
                                </select>
                                <span class="error">Blala</span>
                                <br>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-8 offset-sm-4">
                                <button class="btn btn-primary "id="submit_signup" type="button"onclick="return testInput()" >Sign Up</button>
                            </div>
                        </div>

                    </form>
                </div>
            </div>
            <br>

        </div>


    </body>
</html>
