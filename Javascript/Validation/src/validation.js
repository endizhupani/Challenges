/** This is the file where you will write the JavaScript code for validation the different parts of the form **/

function formValidation()
{
    var uid = document.registration.userid;
    var passid = document.registration.passid;
    var uname = document.registration.username;
    var uadd = document.registration.address;
    var ucountry = document.registration.country;
    var uzip = document.registration.zip;
    var uemail = document.registration.email;
    var mgender = document.registration.msex;
    var fgender = document.registration.fsex;

    if(validateUsername(uid,5,12))
    {
        if(validatePassword(passid,7,12))
        {
            if(allLetter(uname))
            {
                if(alphanumeric(uadd))
                {
                    if(countryselect(ucountry))
                    {
                        if(allnumeric(uzip))
                        {
                            if(checkEmail(uemail))
                            {
                                if(validgender(mgender,fgender))
                                {
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    return false;
}


function validateUsername(fld) {
   //function for validating usernames
}

function validatePassword(fld) {
    //function for validating passwords
}

function allLetter(uname){
    //function for validating names
}

function alphanumeric(uadd){
   //function for validating address
}

function countryselect(ucountry){
    //function for validating country
}

function allnumeric(uzip){
    //function validating ZIP code
}

function checkEmail(uemail) {
    //function validating email
}

function validgender(mgender,fgender){
    //function validating gender
}


