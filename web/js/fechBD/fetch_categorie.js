

$(document).ready(function(){
      $.post('../select_data', {fetch: "categorie"},
                function (data) {
                    obj = $.parseJSON(data);
                    les_li="";
                    
                   for (var i = 0; i < obj.length; i++) {
                       les_li+='<a class="dropdown-item" href="#">'+obj[i].categorie+'</a>';
                   
                }
                    
                 $("#menu-categorie").html(les_li) ;
                    
                    
                   
                                                  
                    });
});
