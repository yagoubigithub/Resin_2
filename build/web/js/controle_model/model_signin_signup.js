/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$("#login_buttton").click(function () {
    $('#loginModal').modal('show');
    $('#signin').addClass("active");
    $('#signup').removeClass("active");
    $("#signup_link").removeClass("active");
    $('#login_link').addClass("active");
});
$("#signup_button").click(function () {
    $('#loginModal').modal('show');
   
    
     $('#signup').addClass("active");
    $('#signin').removeClass("active");
    $("#login_link").removeClass("active");
    $('#signup_link').addClass("active");
});