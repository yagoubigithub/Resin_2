/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$("#logout").click(function(){
     $.post('../create_session', {logout: "true"},
                function (data) {
                    window.location.href = '../index.jsp';
                 
                    
                    });
});
