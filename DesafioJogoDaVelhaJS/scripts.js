let jogador = null;
let jogadorSelecionado = document.getElementById('jogador-selecionado');
var quadrados = document.getElementsByClassName('quadrado')

mudarJogador("X");

function escolherQuadrado(id){
    let quadrado = document.getElementById(id);
    if(quadrado.innerHTML !== '-'){
        return;
    }

    quadrado.innerHTML = jogador;
    quadrado.style.color = '#000';

    checaVencer()

    if(jogador == "X"){
        mudarJogador("O")
    }else{
        mudarJogador("X");
    }
}

function mudarJogador(valor){
    jogador = valor;
    jogadorSelecionado.innerHTML = jogador; 

}

function checaVencer(){
    let quadrado1 = document.getElementById('1');
    let quadrado2 = document.getElementById('2');
    let quadrado3 = document.getElementById('3');
    let quadrado4 = document.getElementById('4');
    let quadrado5 = document.getElementById('5');
    let quadrado6 = document.getElementById('6');
    let quadrado7 = document.getElementById('7');
    let quadrado8 = document.getElementById('8');
    let quadrado9 = document.getElementById('9');

    if(quadrado1.innerHTML !== '-' && quadrado1.innerHTML === quadrado2.innerHTML && quadrado2.innerHTML === quadrado3.innerHTML){
        quadrado1.style.background = '#00f00f';
        quadrado2.style.background = '#00f00f';
        quadrado3.style.background = '#00f00f';
        let vencedor = document.getElementById('vencedor-selecionado');
        vencedor.innerHTML = jogador  
    }
    else if(quadrado4.innerHTML !== '-' && quadrado4.innerHTML == quadrado5.innerHTML && quadrado5.innerHTML == quadrado6.innerHTML){
        quadrado4.style.background = '#00f00f';
        quadrado5.style.background = '#00f00f';
        quadrado6.style.background = '#00f00f';
        let vencedor = document.getElementById('vencedor-selecionado');
        vencedor.innerHTML = jogador
    }
    else if(quadrado7.innerHTML !== '-' && quadrado7.innerHTML == quadrado8.innerHTML && quadrado8.innerHTML == quadrado9.innerHTML){
        quadrado7.style.background = '#00f00f';
        quadrado8.style.background = '#00f00f';
        quadrado9.style.background = '#00f00f';
        let vencedor = document.getElementById('vencedor-selecionado');
        vencedor.innerHTML = jogador
    }
    else if(quadrado1.innerHTML !== '-' && quadrado1.innerHTML == quadrado4.innerHTML && quadrado4.innerHTML == quadrado7.innerHTML){
        quadrado1.style.background = '#00f00f';
        quadrado4.style.background = '#00f00f';
        quadrado7.style.background = '#00f00f';
        let vencedor = document.getElementById('vencedor-selecionado');
        vencedor.innerHTML = jogador
    }
    else if(quadrado2.innerHTML !== '-' && quadrado2.innerHTML == quadrado5.innerHTML && quadrado5.innerHTML == quadrado8.innerHTML){
        quadrado2.style.background = '#00f00f';
        quadrado5.style.background = '#00f00f';
        quadrado8.style.background = '#00f00f';
        let vencedor = document.getElementById('vencedor-selecionado');
        vencedor.innerHTML = jogador
    }
    else if(quadrado3 !== '-' && quadrado3 !== '-' && quadrado3.innerHTML == quadrado6.innerHTML && quadrado6.innerHTML == quadrado9.innerHTML){
        quadrado3.style.background = '#00f00f';
        quadrado6.style.background = '#00f00f';
        quadrado9.style.background = '#00f00f';
        let vencedor = document.getElementById('vencedor-selecionado');
        vencedor.innerHTML = jogador
    }
    else if(quadrado5.innerHTML !== '-' && quadrado1.innerHTML == quadrado5.innerHTML && quadrado5.innerHTML == quadrado9.innerHTML){
        quadrado1.style.background = '#00f00f';
        quadrado5.style.background = '#00f00f';
        quadrado9.style.background = '#00f00f';
        let vencedor = document.getElementById('vencedor-selecionado');
        vencedor.innerHTML = jogador
    }
    else if(quadrado3.innerHTML !== '-' && quadrado3.innerHTML == quadrado5.innerHTML && quadrado5.innerHTML == quadrado7.innerHTML){
        quadrado3.style.background = '#00f00f';
        quadrado5.style.background = '#00f00f';
        quadrado7.style.background = '#00f00f';
        let vencedor = document.getElementById('vencedor-selecionado');
        vencedor.innerHTML = jogador
    }
}
