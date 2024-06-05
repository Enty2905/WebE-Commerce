var menuMbIcon = document.querySelector('.menu-mb-icon');
var menuMb = document.querySelector('.menu-mb');

menuMbIcon.addEventListener('click', function() {
    if (menuMb.classList.contains('show')) {
        menuMb.classList.remove('show');
        setTimeout(function() {
            menuMb.style.display = 'none';
        }, 500); // Thời gian này cần khớp với thời gian transition trong CSS
    } else {
        menuMb.style.display = 'block';
        setTimeout(function() {
            menuMb.classList.add('show');
        }, 10); // Thời gian nhỏ để đảm bảo display đã được cập nhật trước khi thêm lớp
    }
});
