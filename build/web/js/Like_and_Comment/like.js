/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
    sendLike=function(id,user_id){
        $.post('../LIKE', {id: id},
                function (data) {
                   alert(data);
                 
                    $("#"+id).children().css({"color":"red"});
                });
    };

});

