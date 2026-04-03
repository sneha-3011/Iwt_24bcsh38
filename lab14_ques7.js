document.getElementById("regform").addEventListener("submit",function(e){
    let name=document.getElementById("name").value;
    let gender=document.querySelector('input[name="gender"]:checked');
    let number=document.getElementById("number").value;
    let add=document.getElementById("add").value;
    let country=document.getElementById("country").value;
    let mail=document.getElementById("mail").value;
    let password=document.getElementById("password").value;
    if(name==="" || gender==="" || number==="" || add==="" || country==="" || mail==="" || password==="")
    {
        alert("All field must filled");
        e.preventDefault();
        return;
    }
    let mobpattern=/^[0-9]{10}$/;
    if(!mobpattern.test(number))
    {
        alert("Mobile number must be exactly 10 digits.");
        e.preventDefault();
        return;
    }
    let emailpattern=/^[^]+@[^ ]+\.[a-z]{2,3}$/;
    if(!emailpattern.test(mail)){
        alert("Enter valid email");
        e.preventDefault();
        return;
    }
    if(password.length<6||password.length>15){
        alert("Password must be between 6 and 15 characters!");
        e.preventDefault();
        return;
    }
    alert("Form submitted successfully");
});
