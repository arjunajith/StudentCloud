



<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
 <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" >
 
 <meta name="ROBOTS" content="NOARCHIVE">
 
 <link rel="icon" type="image/vnd.microsoft.icon" href="http://www.gstatic.com/codesite/ph/images/phosting.ico">
 
 
 <script type="text/javascript">
 
 
 
 
 var codesite_token = null;
 
 
 var CS_env = {"profileUrl":null,"token":null,"assetHostPath":"http://www.gstatic.com/codesite/ph","domainName":null,"assetVersionPath":"http://www.gstatic.com/codesite/ph/16186173366037945081","projectHomeUrl":"/p/zxing","relativeBaseUrl":"","projectName":"zxing","loggedInUserEmail":null};
 var _gaq = _gaq || [];
 _gaq.push(
 ['siteTracker._setAccount', 'UA-18071-1'],
 ['siteTracker._trackPageview']);
 
 _gaq.push(
 ['projectTracker._setAccount', 'UA-788492-4'],
 ['projectTracker._trackPageview']);
 
 (function() {
 var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
 ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
 (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(ga);
 })();
 
 </script>
 
 
 <title>CommandLineEncoder.java - 
 zxing -
 
 
 Multi-format 1D/2D barcode image processing library with clients for Android, Java - Google Project Hosting
 </title>
 <link type="text/css" rel="stylesheet" href="http://www.gstatic.com/codesite/ph/16186173366037945081/css/core.css">
 
 <link type="text/css" rel="stylesheet" href="http://www.gstatic.com/codesite/ph/16186173366037945081/css/ph_detail.css" >
 
 
 <link type="text/css" rel="stylesheet" href="http://www.gstatic.com/codesite/ph/16186173366037945081/css/d_sb.css" >
 
 
 
<!--[if IE]>
 <link type="text/css" rel="stylesheet" href="http://www.gstatic.com/codesite/ph/16186173366037945081/css/d_ie.css" >
<![endif]-->
 <style type="text/css">
 .menuIcon.off { background: no-repeat url(http://www.gstatic.com/codesite/ph/images/dropdown_sprite.gif) 0 -42px }
 .menuIcon.on { background: no-repeat url(http://www.gstatic.com/codesite/ph/images/dropdown_sprite.gif) 0 -28px }
 .menuIcon.down { background: no-repeat url(http://www.gstatic.com/codesite/ph/images/dropdown_sprite.gif) 0 0; }
 
 
 
  tr.inline_comment {
 background: #fff;
 vertical-align: top;
 }
 div.draft, div.published {
 padding: .3em;
 border: 1px solid #999; 
 margin-bottom: .1em;
 font-family: arial, sans-serif;
 max-width: 60em;
 }
 div.draft {
 background: #ffa;
 } 
 div.published {
 background: #e5ecf9;
 }
 div.published .body, div.draft .body {
 padding: .5em .1em .1em .1em;
 max-width: 60em;
 white-space: pre-wrap;
 white-space: -moz-pre-wrap;
 white-space: -pre-wrap;
 white-space: -o-pre-wrap;
 word-wrap: break-word;
 font-size: 1em;
 }
 div.draft .actions {
 margin-left: 1em;
 font-size: 90%;
 }
 div.draft form {
 padding: .5em .5em .5em 0;
 }
 div.draft textarea, div.published textarea {
 width: 95%;
 height: 10em;
 font-family: arial, sans-serif;
 margin-bottom: .5em;
 }

 
 .nocursor, .nocursor td, .cursor_hidden, .cursor_hidden td {
 background-color: white;
 height: 2px;
 }
 .cursor, .cursor td {
 background-color: darkblue;
 height: 2px;
 display: '';
 }
 
 
.list {
 border: 1px solid white;
 border-bottom: 0;
}

 
 </style>
</head>
<body class="t4">
<script type="text/javascript">
 window.___gcfg = {lang: 'en'};
 (function() 
 {var po = document.createElement("script");
 po.type = "text/javascript"; po.async = true;po.src = "https://apis.google.com/js/plusone.js";
 var s = document.getElementsByTagName("script")[0];
 s.parentNode.insertBefore(po, s);
 })();
</script>
<div class="headbg">

 <div id="gaia">
 

 <span>
 
 
 <a href="#" id="projects-dropdown" onclick="return false;"><u>My favorites</u> <small>&#9660;</small></a>
 | <a href="https://www.google.com/accounts/ServiceLogin?service=code&amp;ltmpl=phosting&amp;continue=http%3A%2F%2Fcode.google.com%2Fp%2Fzxing%2Fsource%2Fbrowse%2Ftrunk%2Fjavase%2Fsrc%2Fcom%2Fgoogle%2Fzxing%2Fclient%2Fj2se%2FCommandLineEncoder.java&amp;followup=http%3A%2F%2Fcode.google.com%2Fp%2Fzxing%2Fsource%2Fbrowse%2Ftrunk%2Fjavase%2Fsrc%2Fcom%2Fgoogle%2Fzxing%2Fclient%2Fj2se%2FCommandLineEncoder.java" onclick="_CS_click('/gb/ph/signin');"><u>Sign in</u></a>
 
 </span>

 </div>

 <div class="gbh" style="left: 0pt;"></div>
 <div class="gbh" style="right: 0pt;"></div>
 
 
 <div style="height: 1px"></div>
<!--[if lte IE 7]>
<div style="text-align:center;">
Your version of Internet Explorer is not supported. Try a browser that
contributes to open source, such as <a href="http://www.firefox.com">Firefox</a>,
<a href="http://www.google.com/chrome">Google Chrome</a>, or
<a href="http://code.google.com/chrome/chromeframe/">Google Chrome Frame</a>.
</div>
<![endif]-->



 <table style="padding:0px; margin: 0px 0px 10px 0px; width:100%" cellpadding="0" cellspacing="0"
 itemscope itemtype="http://schema.org/CreativeWork">
 <tr style="height: 58px;">
 
 
 
 <td id="plogo">
 <link itemprop="url" href="/p/zxing">
 <a href="/p/zxing/">
 
 
 <img src="/p/zxing/logo?cct=1339520527"
 alt="Logo" itemprop="image">
 
 </a>
 </td>
 
 <td style="padding-left: 0.5em">
 
 <div id="pname">
 <a href="/p/zxing/"><span itemprop="name">zxing</span></a>
 </div>
 
 <div id="psum">
 <a id="project_summary_link"
 href="/p/zxing/"><span itemprop="description">Multi-format 1D/2D barcode image processing library with clients for Android, Java</span></a>
 
 </div>
 
 
 </td>
 <td style="white-space:nowrap;text-align:right; vertical-align:bottom;">
 
 <form action="/hosting/search">
 <input size="30" name="q" value="" type="text">
 
 <input type="submit" name="projectsearch" value="Search projects" >
 </form>
 
 </tr>
 </table>

</div>

 
<div id="mt" class="gtb"> 
 <a href="/p/zxing/" class="tab ">Project&nbsp;Home</a>
 
 
 
 
 <a href="/p/zxing/downloads/list" class="tab ">Downloads</a>
 
 
 
 
 
 <a href="/p/zxing/w/list" class="tab ">Wiki</a>
 
 
 
 
 
 <a href="/p/zxing/issues/list"
 class="tab ">Issues</a>
 
 
 
 
 
 <a href="/p/zxing/source/checkout"
 class="tab active">Source</a>
 
 
 
 
 
 
 
 <div class=gtbc></div>
</div>
<table cellspacing="0" cellpadding="0" width="100%" align="center" border="0" class="st">
 <tr>
 
 
 
 
 
 
 
 <td class="subt">
 <div class="st2">
 <div class="isf">
 
 


 <span class="inst1"><a href="/p/zxing/source/checkout">Checkout</a></span> &nbsp;
 <span class="inst2"><a href="/p/zxing/source/browse/trunk">Browse</a></span> &nbsp;
 <span class="inst3"><a href="/p/zxing/source/list">Changes</a></span> &nbsp;
 
 &nbsp;
 
 
 <form action="/p/zxing/source/search" method="get" style="display:inline"
 onsubmit="document.getElementById('codesearchq').value = document.getElementById('origq').value">
 <input type="hidden" name="q" id="codesearchq" value="">
 <input type="text" maxlength="2048" size="38" id="origq" name="origq" value="" title="Google Code Search" style="font-size:92%">&nbsp;<input type="submit" value="Search Trunk" name="btnG" style="font-size:92%">
 
 
 
 
 
 
 </form>
 <script type="text/javascript">
 
 function codesearchQuery(form) {
 var query = document.getElementById('q').value;
 if (query) { form.action += '%20' + query; }
 }
 </script>
 </div>
</div>

 </td>
 
 
 
 <td align="right" valign="top" class="bevel-right"></td>
 </tr>
</table>


<script type="text/javascript">
 var cancelBubble = false;
 function _go(url) { document.location = url; }
</script>
<div id="maincol"
 
>

 
<!-- IE -->




<div class="expand">
<div id="colcontrol">
<style type="text/css">
 #file_flipper { white-space: nowrap; padding-right: 2em; }
 #file_flipper.hidden { display: none; }
 #file_flipper .pagelink { color: #0000CC; text-decoration: underline; }
 #file_flipper #visiblefiles { padding-left: 0.5em; padding-right: 0.5em; }
</style>
<table id="nav_and_rev" class="list"
 cellpadding="0" cellspacing="0" width="100%">
 <tr>
 
 <td nowrap="nowrap" class="src_crumbs src_nav" width="33%">
 <strong class="src_nav">Source path:&nbsp;</strong>
 <span id="crumb_root">
 
 <a href="/p/zxing/source/browse/">svn</a>/&nbsp;</span>
 <span id="crumb_links" class="ifClosed"><a href="/p/zxing/source/browse/trunk/">trunk</a><span class="sp">/&nbsp;</span><a href="/p/zxing/source/browse/trunk/javase/">javase</a><span class="sp">/&nbsp;</span><a href="/p/zxing/source/browse/trunk/javase/src/">src</a><span class="sp">/&nbsp;</span><a href="/p/zxing/source/browse/trunk/javase/src/com/">com</a><span class="sp">/&nbsp;</span><a href="/p/zxing/source/browse/trunk/javase/src/com/google/">google</a><span class="sp">/&nbsp;</span><a href="/p/zxing/source/browse/trunk/javase/src/com/google/zxing/">zxing</a><span class="sp">/&nbsp;</span><a href="/p/zxing/source/browse/trunk/javase/src/com/google/zxing/client/">client</a><span class="sp">/&nbsp;</span><a href="/p/zxing/source/browse/trunk/javase/src/com/google/zxing/client/j2se/">j2se</a><span class="sp">/&nbsp;</span>CommandLineEncoder.java</span>
 
 

 </td>
 
 
 <td nowrap="nowrap" width="33%" align="right">
 <table cellpadding="0" cellspacing="0" style="font-size: 100%"><tr>
 
 
 <td class="flipper"><b>r2408</b></td>
 
 </tr></table>
 </td> 
 </tr>
</table>

<div class="fc">
 
 
 
<style type="text/css">
.undermouse span {
 background-image: url(http://www.gstatic.com/codesite/ph/images/comments.gif); }
</style>
<table class="opened" id="review_comment_area"
><tr>
<td id="nums">
<pre><table width="100%"><tr class="nocursor"><td></td></tr></table></pre>
<pre><table width="100%" id="nums_table_0"><tr id="gr_svn2408_1"

><td id="1"><a href="#1">1</a></td></tr
><tr id="gr_svn2408_2"

><td id="2"><a href="#2">2</a></td></tr
><tr id="gr_svn2408_3"

><td id="3"><a href="#3">3</a></td></tr
><tr id="gr_svn2408_4"

><td id="4"><a href="#4">4</a></td></tr
><tr id="gr_svn2408_5"

><td id="5"><a href="#5">5</a></td></tr
><tr id="gr_svn2408_6"

><td id="6"><a href="#6">6</a></td></tr
><tr id="gr_svn2408_7"

><td id="7"><a href="#7">7</a></td></tr
><tr id="gr_svn2408_8"

><td id="8"><a href="#8">8</a></td></tr
><tr id="gr_svn2408_9"

><td id="9"><a href="#9">9</a></td></tr
><tr id="gr_svn2408_10"

><td id="10"><a href="#10">10</a></td></tr
><tr id="gr_svn2408_11"

><td id="11"><a href="#11">11</a></td></tr
><tr id="gr_svn2408_12"

><td id="12"><a href="#12">12</a></td></tr
><tr id="gr_svn2408_13"

><td id="13"><a href="#13">13</a></td></tr
><tr id="gr_svn2408_14"

><td id="14"><a href="#14">14</a></td></tr
><tr id="gr_svn2408_15"

><td id="15"><a href="#15">15</a></td></tr
><tr id="gr_svn2408_16"

><td id="16"><a href="#16">16</a></td></tr
><tr id="gr_svn2408_17"

><td id="17"><a href="#17">17</a></td></tr
><tr id="gr_svn2408_18"

><td id="18"><a href="#18">18</a></td></tr
><tr id="gr_svn2408_19"

><td id="19"><a href="#19">19</a></td></tr
><tr id="gr_svn2408_20"

><td id="20"><a href="#20">20</a></td></tr
><tr id="gr_svn2408_21"

><td id="21"><a href="#21">21</a></td></tr
><tr id="gr_svn2408_22"

><td id="22"><a href="#22">22</a></td></tr
><tr id="gr_svn2408_23"

><td id="23"><a href="#23">23</a></td></tr
><tr id="gr_svn2408_24"

><td id="24"><a href="#24">24</a></td></tr
><tr id="gr_svn2408_25"

><td id="25"><a href="#25">25</a></td></tr
><tr id="gr_svn2408_26"

><td id="26"><a href="#26">26</a></td></tr
><tr id="gr_svn2408_27"

><td id="27"><a href="#27">27</a></td></tr
><tr id="gr_svn2408_28"

><td id="28"><a href="#28">28</a></td></tr
><tr id="gr_svn2408_29"

><td id="29"><a href="#29">29</a></td></tr
><tr id="gr_svn2408_30"

><td id="30"><a href="#30">30</a></td></tr
><tr id="gr_svn2408_31"

><td id="31"><a href="#31">31</a></td></tr
><tr id="gr_svn2408_32"

><td id="32"><a href="#32">32</a></td></tr
><tr id="gr_svn2408_33"

><td id="33"><a href="#33">33</a></td></tr
><tr id="gr_svn2408_34"

><td id="34"><a href="#34">34</a></td></tr
><tr id="gr_svn2408_35"

><td id="35"><a href="#35">35</a></td></tr
><tr id="gr_svn2408_36"

><td id="36"><a href="#36">36</a></td></tr
><tr id="gr_svn2408_37"

><td id="37"><a href="#37">37</a></td></tr
><tr id="gr_svn2408_38"

><td id="38"><a href="#38">38</a></td></tr
><tr id="gr_svn2408_39"

><td id="39"><a href="#39">39</a></td></tr
><tr id="gr_svn2408_40"

><td id="40"><a href="#40">40</a></td></tr
><tr id="gr_svn2408_41"

><td id="41"><a href="#41">41</a></td></tr
><tr id="gr_svn2408_42"

><td id="42"><a href="#42">42</a></td></tr
><tr id="gr_svn2408_43"

><td id="43"><a href="#43">43</a></td></tr
><tr id="gr_svn2408_44"

><td id="44"><a href="#44">44</a></td></tr
><tr id="gr_svn2408_45"

><td id="45"><a href="#45">45</a></td></tr
><tr id="gr_svn2408_46"

><td id="46"><a href="#46">46</a></td></tr
><tr id="gr_svn2408_47"

><td id="47"><a href="#47">47</a></td></tr
><tr id="gr_svn2408_48"

><td id="48"><a href="#48">48</a></td></tr
><tr id="gr_svn2408_49"

><td id="49"><a href="#49">49</a></td></tr
><tr id="gr_svn2408_50"

><td id="50"><a href="#50">50</a></td></tr
><tr id="gr_svn2408_51"

><td id="51"><a href="#51">51</a></td></tr
><tr id="gr_svn2408_52"

><td id="52"><a href="#52">52</a></td></tr
><tr id="gr_svn2408_53"

><td id="53"><a href="#53">53</a></td></tr
><tr id="gr_svn2408_54"

><td id="54"><a href="#54">54</a></td></tr
><tr id="gr_svn2408_55"

><td id="55"><a href="#55">55</a></td></tr
><tr id="gr_svn2408_56"

><td id="56"><a href="#56">56</a></td></tr
><tr id="gr_svn2408_57"

><td id="57"><a href="#57">57</a></td></tr
><tr id="gr_svn2408_58"

><td id="58"><a href="#58">58</a></td></tr
><tr id="gr_svn2408_59"

><td id="59"><a href="#59">59</a></td></tr
><tr id="gr_svn2408_60"

><td id="60"><a href="#60">60</a></td></tr
><tr id="gr_svn2408_61"

><td id="61"><a href="#61">61</a></td></tr
><tr id="gr_svn2408_62"

><td id="62"><a href="#62">62</a></td></tr
><tr id="gr_svn2408_63"

><td id="63"><a href="#63">63</a></td></tr
><tr id="gr_svn2408_64"

><td id="64"><a href="#64">64</a></td></tr
><tr id="gr_svn2408_65"

><td id="65"><a href="#65">65</a></td></tr
><tr id="gr_svn2408_66"

><td id="66"><a href="#66">66</a></td></tr
><tr id="gr_svn2408_67"

><td id="67"><a href="#67">67</a></td></tr
><tr id="gr_svn2408_68"

><td id="68"><a href="#68">68</a></td></tr
><tr id="gr_svn2408_69"

><td id="69"><a href="#69">69</a></td></tr
><tr id="gr_svn2408_70"

><td id="70"><a href="#70">70</a></td></tr
><tr id="gr_svn2408_71"

><td id="71"><a href="#71">71</a></td></tr
><tr id="gr_svn2408_72"

><td id="72"><a href="#72">72</a></td></tr
><tr id="gr_svn2408_73"

><td id="73"><a href="#73">73</a></td></tr
><tr id="gr_svn2408_74"

><td id="74"><a href="#74">74</a></td></tr
><tr id="gr_svn2408_75"

><td id="75"><a href="#75">75</a></td></tr
><tr id="gr_svn2408_76"

><td id="76"><a href="#76">76</a></td></tr
><tr id="gr_svn2408_77"

><td id="77"><a href="#77">77</a></td></tr
><tr id="gr_svn2408_78"

><td id="78"><a href="#78">78</a></td></tr
><tr id="gr_svn2408_79"

><td id="79"><a href="#79">79</a></td></tr
><tr id="gr_svn2408_80"

><td id="80"><a href="#80">80</a></td></tr
><tr id="gr_svn2408_81"

><td id="81"><a href="#81">81</a></td></tr
><tr id="gr_svn2408_82"

><td id="82"><a href="#82">82</a></td></tr
><tr id="gr_svn2408_83"

><td id="83"><a href="#83">83</a></td></tr
><tr id="gr_svn2408_84"

><td id="84"><a href="#84">84</a></td></tr
><tr id="gr_svn2408_85"

><td id="85"><a href="#85">85</a></td></tr
><tr id="gr_svn2408_86"

><td id="86"><a href="#86">86</a></td></tr
><tr id="gr_svn2408_87"

><td id="87"><a href="#87">87</a></td></tr
><tr id="gr_svn2408_88"

><td id="88"><a href="#88">88</a></td></tr
><tr id="gr_svn2408_89"

><td id="89"><a href="#89">89</a></td></tr
><tr id="gr_svn2408_90"

><td id="90"><a href="#90">90</a></td></tr
><tr id="gr_svn2408_91"

><td id="91"><a href="#91">91</a></td></tr
><tr id="gr_svn2408_92"

><td id="92"><a href="#92">92</a></td></tr
><tr id="gr_svn2408_93"

><td id="93"><a href="#93">93</a></td></tr
><tr id="gr_svn2408_94"

><td id="94"><a href="#94">94</a></td></tr
><tr id="gr_svn2408_95"

><td id="95"><a href="#95">95</a></td></tr
><tr id="gr_svn2408_96"

><td id="96"><a href="#96">96</a></td></tr
><tr id="gr_svn2408_97"

><td id="97"><a href="#97">97</a></td></tr
><tr id="gr_svn2408_98"

><td id="98"><a href="#98">98</a></td></tr
><tr id="gr_svn2408_99"

><td id="99"><a href="#99">99</a></td></tr
><tr id="gr_svn2408_100"

><td id="100"><a href="#100">100</a></td></tr
></table></pre>
<pre><table width="100%"><tr class="nocursor"><td></td></tr></table></pre>
</td>
<td id="lines">
<pre><table width="100%"><tr class="cursor_stop cursor_hidden"><td></td></tr></table></pre>
<pre class="prettyprint lang-java"><table id="src_table_0"><tr
id=sl_svn2408_1

><td class="source">/*<br></td></tr
><tr
id=sl_svn2408_2

><td class="source"> * Copyright 2011 ZXing authors<br></td></tr
><tr
id=sl_svn2408_3

><td class="source"> *<br></td></tr
><tr
id=sl_svn2408_4

><td class="source"> * Licensed under the Apache License, Version 2.0 (the &quot;License&quot;);<br></td></tr
><tr
id=sl_svn2408_5

><td class="source"> * you may not use this file except in compliance with the License.<br></td></tr
><tr
id=sl_svn2408_6

><td class="source"> * You may obtain a copy of the License at<br></td></tr
><tr
id=sl_svn2408_7

><td class="source"> *<br></td></tr
><tr
id=sl_svn2408_8

><td class="source"> *      http://www.apache.org/licenses/LICENSE-2.0<br></td></tr
><tr
id=sl_svn2408_9

><td class="source"> *<br></td></tr
><tr
id=sl_svn2408_10

><td class="source"> * Unless required by applicable law or agreed to in writing, software<br></td></tr
><tr
id=sl_svn2408_11

><td class="source"> * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,<br></td></tr
><tr
id=sl_svn2408_12

><td class="source"> * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.<br></td></tr
><tr
id=sl_svn2408_13

><td class="source"> * See the License for the specific language governing permissions and<br></td></tr
><tr
id=sl_svn2408_14

><td class="source"> * limitations under the License.<br></td></tr
><tr
id=sl_svn2408_15

><td class="source"> */<br></td></tr
><tr
id=sl_svn2408_16

><td class="source"><br></td></tr
><tr
id=sl_svn2408_17

><td class="source">package com.google.zxing.client.j2se;<br></td></tr
><tr
id=sl_svn2408_18

><td class="source"><br></td></tr
><tr
id=sl_svn2408_19

><td class="source">import com.google.zxing.BarcodeFormat;<br></td></tr
><tr
id=sl_svn2408_20

><td class="source">import com.google.zxing.MultiFormatWriter;<br></td></tr
><tr
id=sl_svn2408_21

><td class="source">import com.google.zxing.common.BitMatrix;<br></td></tr
><tr
id=sl_svn2408_22

><td class="source"><br></td></tr
><tr
id=sl_svn2408_23

><td class="source">import java.io.File;<br></td></tr
><tr
id=sl_svn2408_24

><td class="source">import java.util.Locale;<br></td></tr
><tr
id=sl_svn2408_25

><td class="source"><br></td></tr
><tr
id=sl_svn2408_26

><td class="source">/**<br></td></tr
><tr
id=sl_svn2408_27

><td class="source"> * Command line utility for encoding barcodes.<br></td></tr
><tr
id=sl_svn2408_28

><td class="source"> * <br></td></tr
><tr
id=sl_svn2408_29

><td class="source"> * @author Sean Owen<br></td></tr
><tr
id=sl_svn2408_30

><td class="source"> */<br></td></tr
><tr
id=sl_svn2408_31

><td class="source">public final class CommandLineEncoder {<br></td></tr
><tr
id=sl_svn2408_32

><td class="source">  <br></td></tr
><tr
id=sl_svn2408_33

><td class="source">  private static final BarcodeFormat DEFAULT_BARCODE_FORMAT = BarcodeFormat.QR_CODE;<br></td></tr
><tr
id=sl_svn2408_34

><td class="source">  private static final String DEFAULT_IMAGE_FORMAT = &quot;PNG&quot;;<br></td></tr
><tr
id=sl_svn2408_35

><td class="source">  private static final String DEFAULT_OUTPUT_FILE = &quot;out&quot;;<br></td></tr
><tr
id=sl_svn2408_36

><td class="source">  private static final int DEFAULT_WIDTH = 300;<br></td></tr
><tr
id=sl_svn2408_37

><td class="source">  private static final int DEFAULT_HEIGHT = 300;<br></td></tr
><tr
id=sl_svn2408_38

><td class="source"><br></td></tr
><tr
id=sl_svn2408_39

><td class="source">  private CommandLineEncoder() {<br></td></tr
><tr
id=sl_svn2408_40

><td class="source">  }<br></td></tr
><tr
id=sl_svn2408_41

><td class="source"><br></td></tr
><tr
id=sl_svn2408_42

><td class="source">  public static void main(String[] args) throws Exception {<br></td></tr
><tr
id=sl_svn2408_43

><td class="source">    if (args.length == 0) {<br></td></tr
><tr
id=sl_svn2408_44

><td class="source">      printUsage();<br></td></tr
><tr
id=sl_svn2408_45

><td class="source">      return;<br></td></tr
><tr
id=sl_svn2408_46

><td class="source">    }<br></td></tr
><tr
id=sl_svn2408_47

><td class="source"><br></td></tr
><tr
id=sl_svn2408_48

><td class="source">    BarcodeFormat barcodeFormat = DEFAULT_BARCODE_FORMAT;<br></td></tr
><tr
id=sl_svn2408_49

><td class="source">    String imageFormat = DEFAULT_IMAGE_FORMAT;<br></td></tr
><tr
id=sl_svn2408_50

><td class="source">    String outFileString = DEFAULT_OUTPUT_FILE;<br></td></tr
><tr
id=sl_svn2408_51

><td class="source">    int width = DEFAULT_WIDTH;<br></td></tr
><tr
id=sl_svn2408_52

><td class="source">    int height = DEFAULT_HEIGHT;<br></td></tr
><tr
id=sl_svn2408_53

><td class="source">    for (String arg : args) {<br></td></tr
><tr
id=sl_svn2408_54

><td class="source">      if (arg.startsWith(&quot;--barcode_format&quot;)) {<br></td></tr
><tr
id=sl_svn2408_55

><td class="source">        barcodeFormat = BarcodeFormat.valueOf(arg.split(&quot;=&quot;)[1]);<br></td></tr
><tr
id=sl_svn2408_56

><td class="source">      } else if (arg.startsWith(&quot;--image_format&quot;)) {<br></td></tr
><tr
id=sl_svn2408_57

><td class="source">        imageFormat = arg.split(&quot;=&quot;)[1];<br></td></tr
><tr
id=sl_svn2408_58

><td class="source">      } else if (arg.startsWith(&quot;--output&quot;)) {<br></td></tr
><tr
id=sl_svn2408_59

><td class="source">        outFileString = arg.split(&quot;=&quot;)[1];<br></td></tr
><tr
id=sl_svn2408_60

><td class="source">      } else if (arg.startsWith(&quot;--width&quot;)) {<br></td></tr
><tr
id=sl_svn2408_61

><td class="source">        width = Integer.parseInt(arg.split(&quot;=&quot;)[1]);<br></td></tr
><tr
id=sl_svn2408_62

><td class="source">      } else if (arg.startsWith(&quot;--height&quot;)) {<br></td></tr
><tr
id=sl_svn2408_63

><td class="source">        height = Integer.parseInt(arg.split(&quot;=&quot;)[1]);<br></td></tr
><tr
id=sl_svn2408_64

><td class="source">      }<br></td></tr
><tr
id=sl_svn2408_65

><td class="source">    }<br></td></tr
><tr
id=sl_svn2408_66

><td class="source">    <br></td></tr
><tr
id=sl_svn2408_67

><td class="source">    if (DEFAULT_OUTPUT_FILE.equals(outFileString)) {<br></td></tr
><tr
id=sl_svn2408_68

><td class="source">      outFileString += &#39;.&#39; + imageFormat.toLowerCase(Locale.ENGLISH);<br></td></tr
><tr
id=sl_svn2408_69

><td class="source">    }<br></td></tr
><tr
id=sl_svn2408_70

><td class="source">        <br></td></tr
><tr
id=sl_svn2408_71

><td class="source">    String contents = null;<br></td></tr
><tr
id=sl_svn2408_72

><td class="source">    for (String arg : args) {<br></td></tr
><tr
id=sl_svn2408_73

><td class="source">      if (!arg.startsWith(&quot;--&quot;)) {<br></td></tr
><tr
id=sl_svn2408_74

><td class="source">        contents = arg;<br></td></tr
><tr
id=sl_svn2408_75

><td class="source">        break;<br></td></tr
><tr
id=sl_svn2408_76

><td class="source">      }<br></td></tr
><tr
id=sl_svn2408_77

><td class="source">    }<br></td></tr
><tr
id=sl_svn2408_78

><td class="source">    <br></td></tr
><tr
id=sl_svn2408_79

><td class="source">    if (contents == null) {<br></td></tr
><tr
id=sl_svn2408_80

><td class="source">      printUsage();<br></td></tr
><tr
id=sl_svn2408_81

><td class="source">      return;<br></td></tr
><tr
id=sl_svn2408_82

><td class="source">    }<br></td></tr
><tr
id=sl_svn2408_83

><td class="source">    <br></td></tr
><tr
id=sl_svn2408_84

><td class="source">    MultiFormatWriter barcodeWriter = new MultiFormatWriter();<br></td></tr
><tr
id=sl_svn2408_85

><td class="source">    BitMatrix matrix = barcodeWriter.encode(contents, barcodeFormat, width, height);<br></td></tr
><tr
id=sl_svn2408_86

><td class="source">    MatrixToImageWriter.writeToFile(matrix, imageFormat, new File(outFileString));<br></td></tr
><tr
id=sl_svn2408_87

><td class="source">  }<br></td></tr
><tr
id=sl_svn2408_88

><td class="source"><br></td></tr
><tr
id=sl_svn2408_89

><td class="source">  private static void printUsage() {<br></td></tr
><tr
id=sl_svn2408_90

><td class="source">    System.err.println(&quot;Encodes barcode images using the ZXing library\n&quot;);<br></td></tr
><tr
id=sl_svn2408_91

><td class="source">    System.err.println(&quot;usage: CommandLineEncoder [ options ] content_to_encode&quot;);<br></td></tr
><tr
id=sl_svn2408_92

><td class="source">    System.err.println(&quot;  --barcode_format=format: Format to encode, from BarcodeFormat class. &quot; +<br></td></tr
><tr
id=sl_svn2408_93

><td class="source">                           &quot;Not all formats are supported. Defaults to QR_CODE.&quot;);<br></td></tr
><tr
id=sl_svn2408_94

><td class="source">    System.err.println(&quot;  --image_format=format: image output format, such as PNG, JPG, GIF. Defaults to PNG&quot;);<br></td></tr
><tr
id=sl_svn2408_95

><td class="source">    System.err.println(&quot;  --output=filename: File to write to. Defaults to out.png&quot;);<br></td></tr
><tr
id=sl_svn2408_96

><td class="source">    System.err.println(&quot;  --width=pixels: Image width. Defaults to 300&quot;);<br></td></tr
><tr
id=sl_svn2408_97

><td class="source">    System.err.println(&quot;  --height=pixels: Image height. Defaults to 300&quot;);<br></td></tr
><tr
id=sl_svn2408_98

><td class="source">  }<br></td></tr
><tr
id=sl_svn2408_99

><td class="source"><br></td></tr
><tr
id=sl_svn2408_100

><td class="source">}<br></td></tr
></table></pre>
<pre><table width="100%"><tr class="cursor_stop cursor_hidden"><td></td></tr></table></pre>
</td>
</tr></table>

 
<script type="text/javascript">
 var lineNumUnderMouse = -1;
 
 function gutterOver(num) {
 gutterOut();
 var newTR = document.getElementById('gr_svn2408_' + num);
 if (newTR) {
 newTR.className = 'undermouse';
 }
 lineNumUnderMouse = num;
 }
 function gutterOut() {
 if (lineNumUnderMouse != -1) {
 var oldTR = document.getElementById(
 'gr_svn2408_' + lineNumUnderMouse);
 if (oldTR) {
 oldTR.className = '';
 }
 lineNumUnderMouse = -1;
 }
 }
 var numsGenState = {table_base_id: 'nums_table_'};
 var srcGenState = {table_base_id: 'src_table_'};
 var alignerRunning = false;
 var startOver = false;
 function setLineNumberHeights() {
 if (alignerRunning) {
 startOver = true;
 return;
 }
 numsGenState.chunk_id = 0;
 numsGenState.table = document.getElementById('nums_table_0');
 numsGenState.row_num = 0;
 if (!numsGenState.table) {
 return; // Silently exit if no file is present.
 }
 srcGenState.chunk_id = 0;
 srcGenState.table = document.getElementById('src_table_0');
 srcGenState.row_num = 0;
 alignerRunning = true;
 continueToSetLineNumberHeights();
 }
 function rowGenerator(genState) {
 if (genState.row_num < genState.table.rows.length) {
 var currentRow = genState.table.rows[genState.row_num];
 genState.row_num++;
 return currentRow;
 }
 var newTable = document.getElementById(
 genState.table_base_id + (genState.chunk_id + 1));
 if (newTable) {
 genState.chunk_id++;
 genState.row_num = 0;
 genState.table = newTable;
 return genState.table.rows[0];
 }
 return null;
 }
 var MAX_ROWS_PER_PASS = 1000;
 function continueToSetLineNumberHeights() {
 var rowsInThisPass = 0;
 var numRow = 1;
 var srcRow = 1;
 while (numRow && srcRow && rowsInThisPass < MAX_ROWS_PER_PASS) {
 numRow = rowGenerator(numsGenState);
 srcRow = rowGenerator(srcGenState);
 rowsInThisPass++;
 if (numRow && srcRow) {
 if (numRow.offsetHeight != srcRow.offsetHeight) {
 numRow.firstChild.style.height = srcRow.offsetHeight + 'px';
 }
 }
 }
 if (rowsInThisPass >= MAX_ROWS_PER_PASS) {
 setTimeout(continueToSetLineNumberHeights, 10);
 } else {
 alignerRunning = false;
 if (startOver) {
 startOver = false;
 setTimeout(setLineNumberHeights, 500);
 }
 }
 }
 function initLineNumberHeights() {
 // Do 2 complete passes, because there can be races
 // between this code and prettify.
 startOver = true;
 setTimeout(setLineNumberHeights, 250);
 window.onresize = setLineNumberHeights;
 }
 initLineNumberHeights();
</script>

 
 
 <div id="log">
 <div style="text-align:right">
 <a class="ifCollapse" href="#" onclick="_toggleMeta(this); return false">Show details</a>
 <a class="ifExpand" href="#" onclick="_toggleMeta(this); return false">Hide details</a>
 </div>
 <div class="ifExpand">
 
 
 <div class="pmeta_bubble_bg" style="border:1px solid white">
 <div class="round4"></div>
 <div class="round2"></div>
 <div class="round1"></div>
 <div class="box-inner">
 <div id="changelog">
 <p>Change log</p>
 <div>
 <a href="/p/zxing/source/detail?spec=svn2408&amp;r=1990">r1990</a>
 by srowen
 on Oct 22, 2011
 &nbsp; <a href="/p/zxing/source/diff?spec=svn2408&r=1990&amp;format=side&amp;path=/trunk/javase/src/com/google/zxing/client/j2se/CommandLineEncoder.java&amp;old_path=/trunk/javase/src/com/google/zxing/client/j2se/CommandLineEncoder.java&amp;old=">Diff</a>
 </div>
 <pre><a title="JavaSE CommandLineRunner wih encoding options" class=closed_ref href="/p/zxing/issues/detail?id=1021"> Issue 1021 </a> command line encoder</pre>
 </div>
 
 
 
 
 
 
 <script type="text/javascript">
 var detail_url = '/p/zxing/source/detail?r=1990&spec=svn2408';
 var publish_url = '/p/zxing/source/detail?r=1990&spec=svn2408#publish';
 // describe the paths of this revision in javascript.
 var changed_paths = [];
 var changed_urls = [];
 
 changed_paths.push('/trunk/javase/src/com/google/zxing/client/j2se/CommandLineEncoder.java');
 changed_urls.push('/p/zxing/source/browse/trunk/javase/src/com/google/zxing/client/j2se/CommandLineEncoder.java?r\x3d1990\x26spec\x3dsvn2408');
 
 var selected_path = '/trunk/javase/src/com/google/zxing/client/j2se/CommandLineEncoder.java';
 
 
 function getCurrentPageIndex() {
 for (var i = 0; i < changed_paths.length; i++) {
 if (selected_path == changed_paths[i]) {
 return i;
 }
 }
 }
 function getNextPage() {
 var i = getCurrentPageIndex();
 if (i < changed_paths.length - 1) {
 return changed_urls[i + 1];
 }
 return null;
 }
 function getPreviousPage() {
 var i = getCurrentPageIndex();
 if (i > 0) {
 return changed_urls[i - 1];
 }
 return null;
 }
 function gotoNextPage() {
 var page = getNextPage();
 if (!page) {
 page = detail_url;
 }
 window.location = page;
 }
 function gotoPreviousPage() {
 var page = getPreviousPage();
 if (!page) {
 page = detail_url;
 }
 window.location = page;
 }
 function gotoDetailPage() {
 window.location = detail_url;
 }
 function gotoPublishPage() {
 window.location = publish_url;
 }
</script>

 
 <style type="text/css">
 #review_nav {
 border-top: 3px solid white;
 padding-top: 6px;
 margin-top: 1em;
 }
 #review_nav td {
 vertical-align: middle;
 }
 #review_nav select {
 margin: .5em 0;
 }
 </style>
 <div id="review_nav">
 <table><tr><td>Go to:&nbsp;</td><td>
 <select name="files_in_rev" onchange="window.location=this.value">
 
 <option value="/p/zxing/source/browse/trunk/javase/src/com/google/zxing/client/j2se/CommandLineEncoder.java?r=1990&amp;spec=svn2408"
 selected="selected"
 >...ent/j2se/CommandLineEncoder.java</option>
 
 </select>
 </td></tr></table>
 
 
 



 <div style="white-space:nowrap">
 Project members,
 <a href="https://www.google.com/accounts/ServiceLogin?service=code&amp;ltmpl=phosting&amp;continue=http%3A%2F%2Fcode.google.com%2Fp%2Fzxing%2Fsource%2Fbrowse%2Ftrunk%2Fjavase%2Fsrc%2Fcom%2Fgoogle%2Fzxing%2Fclient%2Fj2se%2FCommandLineEncoder.java&amp;followup=http%3A%2F%2Fcode.google.com%2Fp%2Fzxing%2Fsource%2Fbrowse%2Ftrunk%2Fjavase%2Fsrc%2Fcom%2Fgoogle%2Fzxing%2Fclient%2Fj2se%2FCommandLineEncoder.java"
 >sign in</a> to write a code review</div>


 
 </div>
 
 
 </div>
 <div class="round1"></div>
 <div class="round2"></div>
 <div class="round4"></div>
 </div>
 <div class="pmeta_bubble_bg" style="border:1px solid white">
 <div class="round4"></div>
 <div class="round2"></div>
 <div class="round1"></div>
 <div class="box-inner">
 <div id="older_bubble">
 <p>Older revisions</p>
 
 <a href="/p/zxing/source/list?path=/trunk/javase/src/com/google/zxing/client/j2se/CommandLineEncoder.java&start=1990">All revisions of this file</a>
 </div>
 </div>
 <div class="round1"></div>
 <div class="round2"></div>
 <div class="round4"></div>
 </div>
 
 <div class="pmeta_bubble_bg" style="border:1px solid white">
 <div class="round4"></div>
 <div class="round2"></div>
 <div class="round1"></div>
 <div class="box-inner">
 <div id="fileinfo_bubble">
 <p>File info</p>
 
 <div>Size: 3497 bytes,
 100 lines</div>
 
 <div><a href="//zxing.googlecode.com/svn/trunk/javase/src/com/google/zxing/client/j2se/CommandLineEncoder.java">View raw file</a></div>
 </div>
 
 </div>
 <div class="round1"></div>
 <div class="round2"></div>
 <div class="round4"></div>
 </div>
 </div>
 </div>


</div>

</div>
</div>

<script src="http://www.gstatic.com/codesite/ph/16186173366037945081/js/prettify/prettify.js"></script>
<script type="text/javascript">prettyPrint();</script>


<script src="http://www.gstatic.com/codesite/ph/16186173366037945081/js/source_file_scripts.js"></script>

 <script type="text/javascript" src="http://www.gstatic.com/codesite/ph/16186173366037945081/js/kibbles.js"></script>
 <script type="text/javascript">
 var lastStop = null;
 var initialized = false;
 
 function updateCursor(next, prev) {
 if (prev && prev.element) {
 prev.element.className = 'cursor_stop cursor_hidden';
 }
 if (next && next.element) {
 next.element.className = 'cursor_stop cursor';
 lastStop = next.index;
 }
 }
 
 function pubRevealed(data) {
 updateCursorForCell(data.cellId, 'cursor_stop cursor_hidden');
 if (initialized) {
 reloadCursors();
 }
 }
 
 function draftRevealed(data) {
 updateCursorForCell(data.cellId, 'cursor_stop cursor_hidden');
 if (initialized) {
 reloadCursors();
 }
 }
 
 function draftDestroyed(data) {
 updateCursorForCell(data.cellId, 'nocursor');
 if (initialized) {
 reloadCursors();
 }
 }
 function reloadCursors() {
 kibbles.skipper.reset();
 loadCursors();
 if (lastStop != null) {
 kibbles.skipper.setCurrentStop(lastStop);
 }
 }
 // possibly the simplest way to insert any newly added comments
 // is to update the class of the corresponding cursor row,
 // then refresh the entire list of rows.
 function updateCursorForCell(cellId, className) {
 var cell = document.getElementById(cellId);
 // we have to go two rows back to find the cursor location
 var row = getPreviousElement(cell.parentNode);
 row.className = className;
 }
 // returns the previous element, ignores text nodes.
 function getPreviousElement(e) {
 var element = e.previousSibling;
 if (element.nodeType == 3) {
 element = element.previousSibling;
 }
 if (element && element.tagName) {
 return element;
 }
 }
 function loadCursors() {
 // register our elements with skipper
 var elements = CR_getElements('*', 'cursor_stop');
 var len = elements.length;
 for (var i = 0; i < len; i++) {
 var element = elements[i]; 
 element.className = 'cursor_stop cursor_hidden';
 kibbles.skipper.append(element);
 }
 }
 function toggleComments() {
 CR_toggleCommentDisplay();
 reloadCursors();
 }
 function keysOnLoadHandler() {
 // setup skipper
 kibbles.skipper.addStopListener(
 kibbles.skipper.LISTENER_TYPE.PRE, updateCursor);
 // Set the 'offset' option to return the middle of the client area
 // an option can be a static value, or a callback
 kibbles.skipper.setOption('padding_top', 50);
 // Set the 'offset' option to return the middle of the client area
 // an option can be a static value, or a callback
 kibbles.skipper.setOption('padding_bottom', 100);
 // Register our keys
 kibbles.skipper.addFwdKey("n");
 kibbles.skipper.addRevKey("p");
 kibbles.keys.addKeyPressListener(
 'u', function() { window.location = detail_url; });
 kibbles.keys.addKeyPressListener(
 'r', function() { window.location = detail_url + '#publish'; });
 
 kibbles.keys.addKeyPressListener('j', gotoNextPage);
 kibbles.keys.addKeyPressListener('k', gotoPreviousPage);
 
 
 }
 </script>
<script src="http://www.gstatic.com/codesite/ph/16186173366037945081/js/code_review_scripts.js"></script>
<script type="text/javascript">
 function showPublishInstructions() {
 var element = document.getElementById('review_instr');
 if (element) {
 element.className = 'opened';
 }
 }
 var codereviews;
 function revsOnLoadHandler() {
 // register our source container with the commenting code
 var paths = {'svn2408': '/trunk/javase/src/com/google/zxing/client/j2se/CommandLineEncoder.java'}
 codereviews = CR_controller.setup(
 {"profileUrl":null,"token":null,"assetHostPath":"http://www.gstatic.com/codesite/ph","domainName":null,"assetVersionPath":"http://www.gstatic.com/codesite/ph/16186173366037945081","projectHomeUrl":"/p/zxing","relativeBaseUrl":"","projectName":"zxing","loggedInUserEmail":null}, '', 'svn2408', paths,
 CR_BrowseIntegrationFactory);
 
 codereviews.registerActivityListener(CR_ActivityType.REVEAL_DRAFT_PLATE, showPublishInstructions);
 
 codereviews.registerActivityListener(CR_ActivityType.REVEAL_PUB_PLATE, pubRevealed);
 codereviews.registerActivityListener(CR_ActivityType.REVEAL_DRAFT_PLATE, draftRevealed);
 codereviews.registerActivityListener(CR_ActivityType.DISCARD_DRAFT_COMMENT, draftDestroyed);
 
 
 
 
 
 
 
 var initialized = true;
 reloadCursors();
 }
 window.onload = function() {keysOnLoadHandler(); revsOnLoadHandler();};

</script>
<script type="text/javascript" src="http://www.gstatic.com/codesite/ph/16186173366037945081/js/dit_scripts.js"></script>

 
 
 
 <script type="text/javascript" src="http://www.gstatic.com/codesite/ph/16186173366037945081/js/ph_core.js"></script>
 
 
 
 
</div> 

<div id="footer" dir="ltr">
 <div class="text">
 <a href="/projecthosting/terms.html">Terms</a> -
 <a href="http://www.google.com/privacy.html">Privacy</a> -
 <a href="/p/support/">Project Hosting Help</a>
 </div>
</div>
 <div class="hostedBy" style="margin-top: -20px;">
 <span style="vertical-align: top;">Powered by <a href="http://code.google.com/projecthosting/">Google Project Hosting</a></span>
 </div>

 
 


 
 </body>
</html>

