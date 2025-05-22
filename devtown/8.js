function dooperation(){
    // left most vowel in a string
    let firststr = document.getElementById("postion").value;
    let pos = 0,char;
    for (let i = 0 ; i <= firststr.length  ; i++){
        if(firststr[i] == 'A' || firststr[i] == 'E' || firststr[i] == 'I' || firststr[i] == 'O' || firststr[i] == 'U' || firststr[i] == 'a' || firststr[i] == 'e' || firststr[i] == 'i' || firststr[i] == 'o' || firststr[i] == 'u'){
            pos = i+1;
            char = firststr[i];
            break;
        }

    }
    if(pos == 0){
        document.getElementById("first").innerHTML = "No vowel present in the string !!";
    }
    else{
        document.getElementById("first").innerHTML = "The postion of left most vowel is "+pos+" and the character is "+char+".";
    }

    // reverse number
    let secondstr = document.getElementById("reverse").value;
    let newsecondstr = ' ';
    for (let i = secondstr.length - 1 ; i>=0 ; i--){
        newsecondstr += secondstr[i];
    }

    document.getElementById("second").innerHTML = newsecondstr;

}
