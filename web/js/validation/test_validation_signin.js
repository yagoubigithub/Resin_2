/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*******************************************************************/
//Send the email end the password to the server
$(document).ready(function () {
    $("#submit_signin").click(function () {
        var email = $("#email_signin").val();
        var password = $("#password_signin").val();
        $.post('siginin_s', {email: email, password: password},
                function (data) {
                    r = data;
                    if (r === "Auth_error") {
                        alert(r);
                        $(".error_in").html("The email or the password is not correct");
                    } else {
                        var checkox_remember_me = $("#rememberMe");
                        var creat_cookies="true";
                        if(!document.getElementById("rememberMe").checked){
                            creat_cookies="false";
                        }

                        obj = $.parseJSON(r);
                        $.post('create_session', {id: obj.id, firstname: obj.firstname,
                            lastname: obj.lastname, email: obj.email, password: obj.password,
                            tel: obj.tel, city_id: obj.city_id,rememberMe:creat_cookies},
                                function (data) {
                                    window.location.href = './Accueil/display.jsp';

                                });
                    }
                });
    });

});