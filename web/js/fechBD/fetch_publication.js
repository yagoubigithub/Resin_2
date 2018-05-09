/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {
    $.post('../fetchPublication', {fetch: "categorie"},
            function (data) {
                obj = $.parseJSON(data);
                
                les_pub = "";

                for (var i = 0; i < obj.length; i++) {
                    console.log(obj[i].description);
                    les_pub += '<div class="card"><div class="card-body"> <div class="row"><div class="col">\n\
<img src="../images/avatar2.png" width="50" height="50"class="rounded-circle float-left user_image_pub">\n\
<h6 class="user_name_pub"> ' + obj[i].firstname + ' '+obj[i].lastname+ ' </h6> </div></div><br> <div class="row"> <div class="col">\n\
 <p>'+obj[i].nom_article+'</p><strong><p>Prix : <mark>'+obj[i].prix+' DA</mark></p></strong>'+'<p>Tel : '+obj[i].tel+ '</p><button type="button" class=\n\
"btn btn-link" data-toggle="collapse" data-target="#collapseDetail'+obj[i].id+'" aria-expanded="false" aria-controls="collapseDetail'+obj[i].id+'">detail</button><br>\n\
<div class="collapse" id="collapseDetail'+obj[i].id+'"> <div class="card card-body">'+obj[i].description+'</div></div><br></div>  </div> <div class="row"> <div class="col"> \n\
<img src="../images/' + obj[i].image + '" class="img-thumbnail">\n\
</div> </div><div class="row">   <div class="col"><button type="button" class="btn" id="'+obj[i].id+'"><i class="fa fa-thumbs-up"></i> Like</button>\n\
<button type="button" class="btn"><i class="fa fa-comment"></i> Comment</button></div> </div>  <br> </div> </div><br>';

                }

                $("#publication").html(les_pub);


            });
});
