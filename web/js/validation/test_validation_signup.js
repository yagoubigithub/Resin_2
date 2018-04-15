/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var errors_span = document.getElementsByClassName("error");
for (var i = 0; i < errors_span.length; i++) {
    errors_span[i].style.color = "transparent";
}
var form = document.getElementById("myForm");
var Inputs = document.getElementsByClassName("form-control");
function testInput() {
    var b = false;
    /********************Test First Name********************************/
    var firstname = Inputs[0].value;
    var patt = new RegExp("^[a-zA-Z0-9]{3,14}");
    if (!patt.test(firstname)) {
        errors_span[0].style.color = "red";
        errors_span[0].innerHTML = "First name must be less than 15 character and more then 3";
        b = false;
    } else {
        errors_span[0].style.color = "green";
        errors_span[0].innerHTML = "First Name valid";
        b = true;
    }
    /**********************************test Last Name*************************************************************/
    var lastname = Inputs[1].value;
    patt = new RegExp("^[a-zA-Z0-9]{3,14}");
    if (!patt.test(lastname)) {
        errors_span[1].style.color = "red";
        errors_span[1].innerHTML = "Last name must be less than 15 character and more then 3";
        b = false;
    } else {
        errors_span[1].style.color = "green";
        errors_span[1].innerHTML = "Last Name valid";
        b = true;
    }
    /***************************************************************************************************************/

    var email = Inputs[2].value;
    var patt = new RegExp("^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}");
    if (!patt.test(email)) {
        errors_span[2].style.color = "red";
        errors_span[2].innerHTML = "email not valid :make sure that the email not contain any space";
        b = false;
    } else {
        errors_span[2].style.color = "green";
        errors_span[2].innerHTML = "Email valid";
        b = true;
    }
    /************************************test password****************************************************************/
    var password = Inputs[3].value;
    patt = new RegExp("^[a-zA-Z0-9]{3,15}$");
    if (!patt.test(password)) {
        errors_span[3].style.color = "red";
        errors_span[3].innerHTML = "the password must be less than 15 character and more than 3 character and contain only letters and numbers";
        b = false;
    } else {
        errors_span[3].style.color = "green";
        errors_span[3].innerHTML = "password valid";
        b = true;
    }
    /*********************************************************************************************/

    var confirmPassword = Inputs[4].value;
    if (confirmPassword === password && confirmPassword !== "") {
        errors_span[4].style.color = "green";
        errors_span[4].innerHTML = "password confirmation  valid";
        b = true;
    } else {
        errors_span[4].style.color = "red";
        errors_span[4].innerHTML = "Errors in the confirmation";
        b = false;
    }
    /********************************************************************************************/
    var address = Inputs[5].value;
    patt = new RegExp("\d+\s*.{1,}");
    if (!patt.test(address)) {
        errors_span[5].style.color = "red";
        errors_span[5].innerHTML = "Streeet address not valid";
        b = false;
    } else {
        errors_span[5].style.color = "green";
        errors_span[5].innerHTML = "street address valid";
        b = true;
    }
    /********************************************************************************************************/
    var city = Inputs[6].value;
    if (city === "") {
        errors_span[6].style.color = "red";
        errors_span[6].innerHTML = "select a city";
        b = false;
    } else {
        errors_span[6].style.color = "green";
        errors_span[6].innerHTML = "";
        b = true;
    }
    return b;
}

$("#submit_signup").click(function () {
    b = testInput();
    if (b) {
        var firstname = $("#firstname").val();
        var lastname = $("#lastname").val();
        var email = $("#email").val();
        var password = $("#password").val();
        var address = $("#address").val();
        var city = $("#city").val();

        $.post('siginup_s', {firstname: firstname, lastname: lastname
            , email: email, password: password, address: address, city: city},
                function (data) {

                  
                        obj = $.parseJSON(data);
                        if (obj.firstname === "exist") {
                            document.getElementsByClassName("error")[2].innerHTML = "this email is already exist";
                            document.getElementsByClassName("error")[2].style.color = "red";
                        } else {
                            
                             $.post('create_session', {id:obj.id,firstname:obj.firstname,
                                lastname:obj.lastname, email: obj.email, password: obj.password,
                                address: obj.address, city_id: obj.city_id},
                function (data) {
                    window.location.href = './Accueil/display.jsp';
                    alert(data);
                });
                        }

                    
                });
    }
});