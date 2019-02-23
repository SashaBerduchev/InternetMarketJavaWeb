function slideText(){
    $('.text').slideToggle()
    var button = document.getElementById('button')


    if(button.innerHTML === 'Show More'){
        button.innerHTML = 'show less'
    }
    else{
        button.innerHTML = 'show more'
    }
}


$('.button').click(slideText)