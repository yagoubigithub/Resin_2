/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var isJpg = function(name) {
    return name.match(/jpg$/i);
};
    
var isPng = function(name) {
    return name.match(/png$/i);
};
    
$(document).ready(function() {
    var file = $('[name="file"]');
   
    
    $('#post').on('click', function() {
        var filename = $.trim(file.val());
        
        if (!(isJpg(filename) || isPng(filename))) {
            alert('Please browse a JPG/PNG file to upload ...');
            return;
        }
        
        $.ajax({
            url: '../FileUploadServlet1',
            type: "POST",
            data: new FormData(document.getElementById("upload-form")),
            enctype: 'multipart/form-data',
            processData: false,
            contentType: false
          }).done(function(data) {
              alert("hala");
               file.val('');
          }).fail(function(jqXHR, textStatus) {
              //alert(jqXHR.responseText);
              alert('File upload failed ...');
          });
        
    });
    
    
});
