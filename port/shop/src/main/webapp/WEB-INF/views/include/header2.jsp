<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />

  <title>Starbucks Coffee Korea</title>

  <!--Open Graph-->
  <!--http://ogp.me/-->
  <meta property="og:type" content="website" />
  <meta property="og:site_name" content="Starbucks" />
  <meta property="og:title" content="Starbucks Coffee Korea" />
  <meta property="og:description" content="��Ÿ������ ���迡�� ���� ū �ٱ��� Ŀ�� ����������, 64�������� �� 23,187���� ������ ��ϰ� �ֽ��ϴ�." />
  <meta property="og:image" content="./images/starbucks_seo.jpg" />
  <meta property="og:url" content="https://starbucks.co.kr" />

  <!--Twitter Card-->
  <!--https://developer.twitter.com/en/docs/twitter-for-websites/cards/guides/getting-started-->
  <meta property="twitter:card" content="summary" />
  <meta property="twitter:site" content="Starbucks" />
  <meta property="twitter:title" content="Starbucks Coffee Korea" />
  <meta property="twitter:description" content="��Ÿ������ ���迡�� ���� ū �ٱ��� Ŀ�� ����������, 64�������� �� 23,187���� ������ ��ϰ� �ֽ��ϴ�." />
  <meta property="twitter:image" content="./images/starbucks_seo.jpg" />
  <meta property="twitter:url" content="https://starbucks.co.kr" />

  <!--�ĺ���-->
  <!--<link rel="shortcut icon" href="favicon.ico" />-->
  <link rel="icon" href="./favicon.png" />
  <!--������ ��Ÿ�� �ʱ�ȭ-->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css" />
  <!--Google Fonts - �������-->
  <link rel="preconnect" href="https://fonts.gstatic.com" />
  <link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700&display=swap" rel="stylesheet" />
  <!--Google Material Icons-->
  <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons" />

  <link rel="stylesheet" href="${contextPath}/resources/css/main.css" />

  <!--GSAP & ScrollToPlugin-->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/3.5.1/gsap.min.js" integrity="sha512-IQLehpLoVS4fNzl7IfH8Iowfm5+RiMGtHykgZJl9AWMgqx0AmJ6cRWcB+GaGVtIsnC4voMfm8f2vwtY+6oPjpQ==" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/3.5.1/ScrollToPlugin.min.js" integrity="sha512-nTHzMQK7lwWt8nL4KF6DhwLHluv6dVq/hNnj2PBN0xMl2KaMm1PM02csx57mmToPAodHmPsipoERRNn4pG7f+Q==" crossorigin="anonymous"></script>
  <!--Swiper-->
  <link rel="stylesheet" href="https://unpkg.com/swiper@6.8.4/swiper-bundle.min.css" />
  <script src="https://unpkg.com/swiper@6.8.4/swiper-bundle.min.js"></script>
  <!--ScrollMagic-->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/ScrollMagic/2.0.8/ScrollMagic.min.js"></script>
  <!--Lodash-->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/lodash.js/4.17.20/lodash.min.js" integrity="sha512-90vH1Z83AJY9DmlWa8WkjkV79yfS2n2Oxhsi2dZbIv0nC4E6m5AbH8Nh156kkM7JePmqD6tcZsfad1ueoaovww==" crossorigin="anonymous"></script>

  <script defer src="./js/youtube.js"></script>
  <script defer src="./js/main.js"></script>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<link rel="stylesheet" href="${contextPath}/resources/css/style.css"/>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<meta charset="UTF-8">
<script src="${contextPath}/resources/ckeditor/ckeditor.js"></script>


  <!--�ĺ���-->
  <!--<link rel="shortcut icon" href="favicon.ico" />-->
  <link rel="icon" href="./favicon.png" />
  <!--������ ��Ÿ�� �ʱ�ȭ-->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css" />
  <!--Google Fonts - �������-->
  <link rel="preconnect" href="https://fonts.gstatic.com" />
  <link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700&display=swap" rel="stylesheet" />
  <!--Google Material Icons-->
  <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons" />

  <link rel="stylesheet" href="${contextPath}/resources/css/main.css" />
<title>=== SHOP ===</title>
<script>
function replyList(){
	var gdsNum = ${view.gdsNum};

	//�񵿱�� ������ ��û
	$.getJSON("/shop/view/replyList" + "?n=" + gdsNum, function(data){
		var str = "";//�ʱ�ȭ
		$(data).each(function(){
			console.log(data);
			//��¥ �����͸� ���� ���� ��ȯ
			var repDate = new Date(this.repDate);
			repdate = repDate.toLocaleDateString("ko-KR")
	//html�ڵ� ����
	str += "<li data-repNum='" + this.repNum + "'class='list-group-item'>"
	+ "<div class=''>"
	+ "<p class=''>" + this.userName + "</p>"
	+ "<p class='mx-3'>" + repDate + "</p>"
	+ "</div>"
	+ "<div class='replyContent'>"+this.repCon+"</div>"
	+"<c:if test='${member != null}'>"//������ �־�߸� ���������� ����
	+ "<div class='replyFooter my-3'>"
	+ "<button type='button' class='modify btn btn-outline-secondary' data-repNum='"+this.repNum+"'>M</button>"
	+ "<button type='button' class='delete btn btn-outline-secondary mx-3' data-repNum='"+this.repNum+"'>D</button>"
	+ "</div>"
	+"</c:if>"
	+"</li>";
		});
	$("section.replyList ul").html(str);
	});
	}






</script>
<script src="${contextPath}/resources/js/replylist.js"></script>
</head>
<body>

  <!--HEADER-->
  <header>
    <div class="inner">

      <a href="/" class="logo">
        <img src="./images/starbucks_logo.png" alt="STARBUCKS" />
      </a>

      <div class="sub-menu">
        <ul class="menu">
          <li>
            <a href="/signin">Sign In</a>
          </li>
          <li>
            <a href="javascript:void(0)">My Starbucks</a>
          </li>
          <li>
            <a href="javascript:void(0)">Customer Service & Ideas</a>
          </li>
          <li>
            <a href="javascript:void(0)">Find a Store</a>
          </li>
        </ul>
        <div class="search">
          <input type="text" />
          <span class="material-icons">search</span>
        </div>
      </div>

      <ul class="main-menu">
        <li class="item">
          <div class="item__name">COFFEE</div>
          <div class="item__contents">
            <div class="contents__menu">
              <ul class="inner">
                <li>
                  <h4>Ŀ��</h4>
                  <ul>
                    <li>��Ÿ���� ����</li>
                    <li>��Ÿ���� ���</li>
                    <li>��Ÿ���� ��������</li>
                  </ul>
                </li>
                <li>
                  <h4>���������� ����</h4>
                  <ul>
                    <li>���ǿ�</li>
                    <li>���������� ��Ű�ƶ�</li>
                    <li>�Ƹ޸�ī��</li>
                    <li>��Ű�ƶ�</li>
                    <li>īǪġ��</li>
                    <li>��</li>
                    <li>��ī</li>
                    <li>����Ʈ���� �����</li>
                  </ul>
                </li>
                <li>
                  <h4>Ŀ�� �̾߱�</h4>
                  <ul>
                    <li>��Ÿ���� �ν�Ʈ ����Ʈ��</li>
                    <li>�ֻ��� �ƶ��ī ����</li>
                    <li>�� ���� Ŀ�ǰ� �ϼ��Ǳ����</li>
                    <li>Ŭ�ι��� Ŀ�� ���� �ý���</li>
                  </ul>
                </li>
                <li>
                  <h4>�ֻ��� Ŀ�Ǹ� ���� ��</h4>
                  <ul>
                    <li>Ŀ�� ������</li>
                    <li>Ǫ�� ����</li>
                    <li>���̽� Ǫ�� ����</li>
                    <li>Ŀ�� ����Ŀ</li>
                    <li>�����긦 ���忡�� �پ��ϰ� ���� ��</li>
                  </ul>
                </li>
              </ul>
            </div>
            <div class="contents__texture">
              <div class="inner">
                <h4>���� ��︮�� Ŀ�� ã��</h4>
                <p>��Ÿ������ �����п��� ��︮�� Ŀ�Ǹ� ã�Ƶ帳�ϴ�.</p>
                <h4>�ֻ��� Ŀ�Ǹ� ���� ��</h4>
                <p>�������� ����� ���� �پ��� ǳ���� Ŀ�Ǹ� ��ܺ�����.</p>
              </div>
            </div>
          </div>
        </li>
        <li class="item">
          <div class="item__name">MENU</div>
          <div class="item__contents">
            <div class="contents__menu">
              <ul class="inner">
                <li>
                  <h4>����</h4>
                  <ul>
                    <li>�ݵ� ���</li>
                    <li>���� Ŀ��</li>
                    <li>����������</li>
                    <li>����Ǫġ��</li>
                    <li>����� ����</li>
                    <li>��Ÿ���� ������</li>
                    <li>Ƽ(Ƽ�ٳ�)</li>
                    <li>��Ÿ ���� ����</li>
                    <li>��Ÿ���� �ֽ�(������)</li>
                  </ul>
                </li>
                <li>
                  <h4>Ǫ��</h4>
                  <ul>
                    <li>����Ŀ��</li>
                    <li>����</li>
                    <li>������ġ & ������</li>
                    <li>������ Ǫ��</li>
                    <li>���� & ���Ʈ</li>
                    <li>���� & �̴� ����Ʈ</li>
                    <li>���̽�ũ��</li>
                  </ul>
                </li>
                <li>
                  <h4>��ǰ</h4>
                  <ul>
                    <li>�ӱ�</li>
                    <li>�۶�</li>
                    <li>�ö�ƽ �Һ�</li>
                    <li>�����θ��� �Һ�</li>
                    <li>���º�</li>
                    <li>�׼�����</li>
                    <li>Ŀ�� ��ǰ</li>
                    <li>��Ű�� Ƽ(Ƽ�ٳ�)</li>
                  </ul>
                </li>
                <li>
                  <h4>ī��</h4>
                  <ul>
                    <li>�ǹ�ī��</li>
                    <li>e-Gift ī��</li>
                  </ul>
                </li>
                <li>
                  <h4>�޴� �̾߱�</h4>
                  <ul>
                    <li>�ݵ� ���</li>
                    <li>��Ÿ���� Ƽ�ٳ�</li>
                  </ul>
                </li>
              </ul>
            </div>
            <div class="contents__texture">
              <div class="inner">
                <h4>��Ÿ���� Ƽ�ٳ�</h4>
                <p>�پ��� ���ٰ� ��ŷ� �� �����ִ� ���� ���ο� ���� ���� Ƽ�� �����Դϴ�.</p>
              </div>
            </div>
          </div>
        </li>
        <li class="item">
          <div class="item__name">STORE</div>
          <div class="item__contents">
            <div class="contents__menu">
              <ul class="inner">
                <li>
                  <h4>���� ã��</h4>
                  <ul>
                    <li>�� �˻�</li>
                    <li>���� �˻�</li>
                    <li>My ����</li>
                  </ul>
                </li>
                <li>
                  <h4>���� �̾߱�</h4>
                  <ul>
                    <li>û�㽺Ÿ</li>
                    <li>Ƽ�ٳ� �ν����̾�� ����</li>
                    <li>�Ĺ̿���ũ</li>
                  </ul>
                </li>
              </ul>
            </div>
            <div class="contents__texture">
              <div class="inner">
                <h4>���� ã��</h4>
                <p>���� ������ ������ ã�ƺ�����.</p>
                <h4>û�㽺Ÿ</h4>
                <p>��Ÿ���� 1,000ȣ���� û�㽺Ÿ���� ����������.</p>
              </div>
            </div>
          </div>
        </li>
        <li class="item">
          <div class="item__name">RESPONSIBILITY</div>
          <div class="item__contents">
            <div class="contents__menu">
              <ul class="inner">
                <li>
                  <h4>���� ��ȸ ���� Ȱ��</h4>
                  <ul>
                    <li>ȸ����� ķ����</li>
                    <li>��ɱ�� ī�� �ҽ�</li>
                    <li>Ŀ�´�Ƽ �����</li>
                    <li>û������ �缺</li>
                    <li>�츮 ��깰 ��� ķ����</li>
                    <li>�츮 ��ȭ ��Ű��</li>
                  </ul>
                </li>
                <li>
                  <h4>ȯ�溸ȣ Ȱ��</h4>
                  <ul>
                    <li>ȯ�� ���ڱ� ���̱�</li>
                    <li>��ȸ�� �� ���� ����</li>
                    <li>Ŀ�� ���� ��Ȱ��</li>
                  </ul>
                </li>
                <li>
                  <h4>���� ����</h4>
                  <ul>
                    <li>������ ���� ����</li>
                    <li>�������� ����</li>
                    <li>Ŀ�� �� ���� Ȱ��</li>
                  </ul>
                </li>
                <li>
                  <h4>�۷ι� ��ȸ ����</h4>
                  <ul>
                    <li>�����濵 ����</li>
                    <li>��Ÿ���� ���</li>
                    <li>������ ������ ��</li>
                  </ul>
                </li>
              </ul>
            </div>
            <div class="contents__texture">
              <div class="inner">
                <h4>Ŀ�ǿ��� ��Ȱ��</h4>
                <p>��Ÿ���� Ŀ�� ���θ� ��Ȱ�� �غ�����.</p>
              </div>
            </div>
          </div>
        </li>
        <li class="item">
          <div class="item__name">MY STARBUCKS REWARDS</div>
          <div class="item__contents">
            <div class="contents__menu">
              <ul class="inner">
                <li>
                  <h4>���� ��Ÿ���� ������</h4>
                  <ul>
                    <li>���� ��Ÿ���� ������ �Ұ�</li>
                    <li>��� �� ����</li>
                    <li>��Ÿ���� ��</li>
                    <li>�����ϴ� ����</li>
                  </ul>
                </li>
                <li>
                  <h4>��Ÿ���� ī��</h4>
                  <ul>
                    <li>��Ÿ���� ī�� �Ұ�</li>
                    <li>��Ÿ���� ī�� ������</li>
                    <li>��� �� ��ȸ</li>
                    <li>���� �� �̿�ȳ�</li>
                    <li>�нǽŰ�/ȯ�ҽ�û</li>
                    <li>�����ϴ� ����</li>
                  </ul>
                </li>
                <li>
                  <h4>��Ÿ���� ī�� e-Gift</h4>
                  <ul>
                    <li>��Ÿ���� ī�� e-Gift �Ұ�</li>
                    <li>�̿�ȳ�</li>
                    <li>�����ϱ�</li>
                    <li>�����ϴ� ����</li>
                  </ul>
                </li>
              </ul>
            </div>
            <div class="contents__texture">
              <div class="inner">
                <h4>��Ÿ���� ī�� ����ϱ�</h4>
                <p>ī�� ��� �� ������ ���񽺸� ������ ��볻���� ��ȸ�غ�����.</p>
              </div>
            </div>
          </div>
        </li>
        <li class="item">
          <div class="item__name">WHAT'S NEW</div>
          <div class="item__contents">
            <div class="contents__menu">
              <ul class="inner">
                <li>
                  <h4>���θ�� & �̺�Ʈ</h4>
                  <ul>
                    <li>��ü</li>
                    <li>��Ÿ���� ī��</li>
                    <li>���� ��Ÿ���� ������</li>
                    <li>�¶���</li>
                    <li>2017 ��Ÿ���� �÷���</li>
                  </ul>
                </li>
                <li>
                  <h4>���ҽ�</h4>
                  <ul>
                    <li>��ü</li>
                    <li>��ǰ ���</li>
                    <li>��Ÿ������ ��ȭ</li>
                    <li>��Ÿ���� ��ȸ����</li>
                    <li>��Ÿ���� ī�����</li>
                  </ul>
                </li>
                <li>
                  <h4>���庰 �̺�Ʈ</h4>
                  <ul>
                    <li>�Ϲ� ����</li>
                    <li>�ű� ����</li>
                  </ul>
                </li>
              </ul>
            </div>
            <div class="contents__texture">
              <div class="inner">
                <h4>���庰 �̺�Ʈ</h4>
                <p>��Ÿ������ ���� �̺�Ʈ ������ Ȯ�� �Ͻ� �� �ֽ��ϴ�.</p>
                <h4>�Ҽ� ��Ÿ����</h4>
                <p>�پ��� ��Ÿ���� SNS ä���� ���� ��Ÿ������ ����������!</p>
              </div>
            </div>
          </div>
        </li>
      </ul>

    </div>