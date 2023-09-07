$(document).ready(function() {
    $('.dropdown-toggle').dropdown(); // 드롭다운 메뉴 활성화
    // 현재 페이지의 URL을 가져옵니다.
    var currentUrl = window.location.pathname;

    // 각 탭 요소를 가져옵니다.
    var tabs = $('.list-group-item');

    // 각 탭에 클릭 이벤트 리스너를 추가합니다.
    tabs.on('click', function() {
        // 클릭한 탭에 active 클래스를 추가하고 나머지 탭에서는 제거합니다.
        tabs.removeClass('active');
        $(this).addClass('active');
    });

    // 현재 페이지의 URL과 탭의 URL을 비교하여 active 클래스를 설정합니다.
    tabs.each(function() {
        var tabUrl = $(this).attr('href');
        if (tabUrl === currentUrl) {
            $(this).addClass('active');
        }
    });
});
