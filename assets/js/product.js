document.querySelector('.select').addEventListener('click', function () {
    var menu = document.querySelector('.menu-item');
    if (menu.classList.contains('show')) {
        menu.querySelectorAll('.item').forEach(function (item, index) {
            setTimeout(function () {
                item.style.opacity = '0';
                item.style.transform = 'translateX(-100%)';
            }, index * 100); 
        });
        setTimeout(function () {
            menu.classList.remove('show');
        }, menu.querySelectorAll('.item').length * 100 + 500); 
    } else {
        menu.classList.add('show');
        menu.querySelectorAll('.item').forEach(function (item, index) {
            setTimeout(function () {
                item.style.opacity = '1';
                item.style.transform = 'translateX(0)';
            }, index * 100); 
        });
    }
});
document.addEventListener("DOMContentLoaded", function() {
    if (window.location.hash) {
        history.replaceState(null, null, ' ');
        window.scrollTo(0, 0);
    }
});
