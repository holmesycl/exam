(function($) {
  'use strict';
  
  // 选择考试时间
  $('#answerTimeInputGroup').datetimepicker({
	  locale: 'zh-cn' // 本地化
  });
  
  $('#answerTimeInputGroup').on("dp.change", function (e) {
      $(this).find('#answerTime').val(e.date);
  });

})(jQuery);