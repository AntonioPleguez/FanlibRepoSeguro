//añadimos un evento para que el scroll en la posicion 0 sea visible
document.addEventListener('DOMContentLoaded', function() {
  let lastScrollPosition = 0;
  const header = document.querySelector('.header');
//luego añadimos otro evento para que cuando hagamos la accion de scrollear se esconda si 100 es menor al movimento, sino vuelve a aparecer
  window.addEventListener('scroll', function() {
    lastScrollPosition = window.scrollY;

      if (100 < lastScrollPosition) {
          
          header.classList.add('hide');
      } else {
          
          header.classList.remove('hide');
      }
    //indicamos que cuando la ultima posicion del scroll sea 100 y el cursor del raton se coloque donde la posicion de la navbar era 0 vuelva a aparecer con un movimiento suave
      lastScrollPosition = 100;
      document.querySelector(".header").onmouseover = function() {
        document.querySelector(".header").style.top = "0";
        header.classList.remove('hide');
        header.classList.add('reveal');
      }
  });
});


