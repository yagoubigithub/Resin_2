

$(document).ready(function(){
      $.post('../select_data', {fetch: "categorie"},
                function (data) {
                    obj = $.parseJSON(data);
                    
                    
                   $("#menu-categorie").html('<a class="dropdown-item" href="#">'+obj.categorie+'</a>') ;
                                                  
                    });
});
