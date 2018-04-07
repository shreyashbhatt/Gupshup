/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(function(){
    $("#registerForm").submit(function(e){
        e.preventDefault();
        $.post("register.jsp",
            {
                uname : $("#uname").val(),
                uemail : $("#uemail").val(),
                upwd : $("#upwd").val()
            },
            function(data,success){
                alert("User registered Succesfully");
            });
        });
    })



