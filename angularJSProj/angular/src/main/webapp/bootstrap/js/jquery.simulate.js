  


<!DOCTYPE html>
<html>
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# githubog: http://ogp.me/ns/fb/githubog#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>jquery-simulate/jquery.simulate.js at master · eduardolundgren/jquery-simulate</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png" />
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png" />
    <link rel="logo" type="image/svg" href="https://github-media-downloads.s3.amazonaws.com/github-logo.svg" />
    <meta property="og:image" content="https://a248.e.akamai.net/assets.github.com/images/modules/logos_page/Octocat.png">
    <link rel="assets" href="https://a248.e.akamai.net/assets.github.com/">
    <link rel="xhr-socket" href="/_sockets" />
    


    <meta name="msapplication-TileImage" content="/windows-tile.png" />
    <meta name="msapplication-TileColor" content="#ffffff" />
    <meta name="selected-link" value="repo_source" data-pjax-transient />
    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="github" name="octolytics-app-id" /><meta content="4734758" name="octolytics-actor-id" /><meta content="kalang82" name="octolytics-actor-login" /><meta content="9f95f1514b3697f2bd52d8f3087cbd6afe7b71d9db88baf4de5c19c05af6997b" name="octolytics-actor-hash" />

    
    
    <link rel="icon" type="image/x-icon" href="/favicon.ico" />

    <meta content="authenticity_token" name="csrf-param" />
<meta content="H3vv3idFFbGFyRl+BozdNUlLQZ3tASiVFH82SSlkP1k=" name="csrf-token" />

    <link href="https://a248.e.akamai.net/assets.github.com/assets/github-da8afabe263d649ce7be36e0f4e768844066f8a4.css" media="all" rel="stylesheet" type="text/css" />
    <link href="https://a248.e.akamai.net/assets.github.com/assets/github2-2754cbe12e8c1e1497ed7ebed2c656fe406187dc.css" media="all" rel="stylesheet" type="text/css" />
    


      <script src="https://a248.e.akamai.net/assets.github.com/assets/frameworks-44b089a6ca2f9a826ab869bed554e38863117420.js" type="text/javascript"></script>
      <script src="https://a248.e.akamai.net/assets.github.com/assets/github-f95f8aaa8ed7687ee7ab69f3f53fe33dc375b9bf.js" type="text/javascript"></script>
      
      <meta http-equiv="x-pjax-version" content="8a3921d0cd627cea5e6fd05be069481f">

        <link data-pjax-transient rel='permalink' href='/eduardolundgren/jquery-simulate/blob/20173772227272fe17a17834802791fd86157d63/jquery.simulate.js'>
    <meta property="og:title" content="jquery-simulate"/>
    <meta property="og:type" content="githubog:gitrepository"/>
    <meta property="og:url" content="https://github.com/eduardolundgren/jquery-simulate"/>
    <meta property="og:image" content="https://secure.gravatar.com/avatar/42327de520e674a6d1686845b30778d0?s=420&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png"/>
    <meta property="og:site_name" content="GitHub"/>
    <meta property="og:description" content="jquery-simulate - jQuery Simulate is a plugin to simulate browser mouse and keyboard real events. This plugin leveraged the jQuery UI Automated tests to another level, giving the possibility to create automated scripts to test UI components (drag, drop, sortables, etc)."/>
    <meta property="twitter:card" content="summary"/>
    <meta property="twitter:site" content="@GitHub">
    <meta property="twitter:title" content="eduardolundgren/jquery-simulate"/>

    <meta name="description" content="jquery-simulate - jQuery Simulate is a plugin to simulate browser mouse and keyboard real events. This plugin leveraged the jQuery UI Automated tests to another level, giving the possibility to create automated scripts to test UI components (drag, drop, sortables, etc)." />


    <meta content="113087" name="octolytics-dimension-user_id" /><meta content="eduardolundgren" name="octolytics-dimension-user_login" /><meta content="346535" name="octolytics-dimension-repository_id" /><meta content="eduardolundgren/jquery-simulate" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="346535" name="octolytics-dimension-repository_network_root_id" /><meta content="eduardolundgren/jquery-simulate" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/eduardolundgren/jquery-simulate/commits/master.atom" rel="alternate" title="Recent Commits to jquery-simulate:master" type="application/atom+xml" />

  </head>


  <body class="logged_in page-blob windows vis-public env-production  ">

    <div class="wrapper">
      
      
      

      <div class="header header-logged-in true">
  <div class="container clearfix">

    <a class="header-logo-invertocat" href="https://github.com/">
  <span class="mega-octicon octicon-mark-github"></span>
</a>

    <div class="divider-vertical"></div>

      <a href="/notifications" class="notification-indicator tooltipped downwards" title="You have no unread notifications">
    <span class="mail-status all-read"></span>
  </a>
  <div class="divider-vertical"></div>


      <div class="command-bar js-command-bar  in-repository">
          <form accept-charset="UTF-8" action="/search" class="command-bar-form" id="top_search_form" method="get">

<input type="text" data-hotkey="/ s" name="q" id="js-command-bar-field" placeholder="Search or type a command" tabindex="1" autocapitalize="off"
    data-username="kalang82"
      data-repo="eduardolundgren/jquery-simulate"
      data-branch="master"
      data-sha="46c81700afb1e99ff8ce14982a593e31bd58bf23"
  >

    <input type="hidden" name="nwo" value="eduardolundgren/jquery-simulate" />

    <div class="select-menu js-menu-container js-select-menu search-context-select-menu">
      <span class="minibutton select-menu-button js-menu-target">
        <span class="js-select-button">This repository</span>
      </span>

      <div class="select-menu-modal-holder js-menu-content js-navigation-container">
        <div class="select-menu-modal">

          <div class="select-menu-item js-navigation-item selected">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" class="js-search-this-repository" name="search_target" value="repository" checked="checked" />
            <div class="select-menu-item-text js-select-button-text">This repository</div>
          </div> <!-- /.select-menu-item -->

          <div class="select-menu-item js-navigation-item">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" name="search_target" value="global" />
            <div class="select-menu-item-text js-select-button-text">All repositories</div>
          </div> <!-- /.select-menu-item -->

        </div>
      </div>
    </div>

  <span class="octicon help tooltipped downwards" title="Show command bar help">
    <span class="octicon octicon-question"></span>
  </span>


  <input type="hidden" name="ref" value="cmdform">

</form>
        <ul class="top-nav">
            <li class="explore"><a href="/explore">Explore</a></li>
            <li><a href="https://gist.github.com">Gist</a></li>
            <li><a href="/blog">Blog</a></li>
          <li><a href="https://help.github.com">Help</a></li>
        </ul>
      </div>

    

  

    <ul id="user-links">
      <li>
        <a href="/kalang82" class="name">
          <img height="20" src="https://secure.gravatar.com/avatar/03081f9ab51587c8d7ac48b88d839f1c?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png" width="20" /> kalang82
        </a>
      </li>

        <li>
          <a href="/new" id="new_repo" class="tooltipped downwards" title="Create a new repo">
            <span class="octicon octicon-repo-create"></span>
          </a>
        </li>

        <li>
          <a href="/settings/profile" id="account_settings"
            class="tooltipped downwards"
            title="Account settings (You have no verified emails)">
            <span class="octicon octicon-tools"></span>
          </a>
            <span class="settings-warning">!</span>
        </li>
        <li>
          <a class="tooltipped downwards" href="/logout" data-method="post" id="logout" title="Sign out">
            <span class="octicon octicon-log-out"></span>
          </a>
        </li>

    </ul>


<div class="js-new-dropdown-contents hidden">
  

<ul class="dropdown-menu">
  <li>
    <a href="/new"><span class="octicon octicon-repo-create"></span> New repository</a>
  </li>
  <li>
    <a href="/organizations/new"><span class="octicon octicon-list-unordered"></span> New organization</a>
  </li>



    <li class="section-title">
      <span title="eduardolundgren/jquery-simulate">This repository</span>
    </li>
    <li>
      <a href="/eduardolundgren/jquery-simulate/issues/new"><span class="octicon octicon-issue-opened"></span> New issue</a>
    </li>
</ul>

</div>


    
  </div>
</div>

      

      

<div class="flash-global flash-warn">
<div class="container">

    <h2>
      You don't have any verified emails.  We recommend <a href="https://github.com/settings/emails">verifying</a> at least one email.
    </h2>
    <p>
      Email verification helps our support team help you in case you have any email issues or lose your password.
    </p>












</div>
</div>



            <div class="global-notices">
      <div class="flash-global">
        <div class="container">
            <a href="/users/kalang82/enable_repository_next?nwo=eduardolundgren%2Fjquery-simulate" class="button minibutton flash-action blue" data-method="post">Enable Repository Next</a>

            <h2>Hey there, would you like to enable our new repository design?</h2>
            <p>We&rsquo;ve been working hard making a <a href="https://github.com/blog/1529-repository-next">faster, better repository experience</a> and we&rsquo;d love to share it with you.</p>
        </div>
      </div>
    </div>
    <div class="site hfeed" itemscope itemtype="http://schema.org/WebPage">
      <div class="hentry">
        
        <div class="pagehead repohead instapaper_ignore readability-menu ">
          <div class="container">
            <div class="title-actions-bar">
              

<ul class="pagehead-actions">


    <li class="subscription">
      <form accept-charset="UTF-8" action="/notifications/subscribe" data-autosubmit="true" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="H3vv3idFFbGFyRl+BozdNUlLQZ3tASiVFH82SSlkP1k=" /></div>  <input id="repository_id" name="repository_id" type="hidden" value="346535" />

    <div class="select-menu js-menu-container js-select-menu">
      <span class="minibutton select-menu-button  js-menu-target">
        <span class="js-select-button">
          <span class="octicon octicon-eye-watch"></span>
          Watch
        </span>
      </span>

      <div class="select-menu-modal-holder">
        <div class="select-menu-modal subscription-menu-modal js-menu-content">
          <div class="select-menu-header">
            <span class="select-menu-title">Notification status</span>
            <span class="octicon octicon-remove-close js-menu-close"></span>
          </div> <!-- /.select-menu-header -->

          <div class="select-menu-list js-navigation-container">

            <div class="select-menu-item js-navigation-item selected">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input checked="checked" id="do_included" name="do" type="radio" value="included" />
                <h4>Not watching</h4>
                <span class="description">You only receive notifications for discussions in which you participate or are @mentioned.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye-watch"></span>
                  Watch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_subscribed" name="do" type="radio" value="subscribed" />
                <h4>Watching</h4>
                <span class="description">You receive notifications for all discussions in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye-unwatch"></span>
                  Unwatch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_ignore" name="do" type="radio" value="ignore" />
                <h4>Ignoring</h4>
                <span class="description">You do not receive any notifications for discussions in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-mute"></span>
                  Stop ignoring
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

          </div> <!-- /.select-menu-list -->

        </div> <!-- /.select-menu-modal -->
      </div> <!-- /.select-menu-modal-holder -->
    </div> <!-- /.select-menu -->

</form>
    </li>

    <li class="js-toggler-container js-social-container starring-container ">
      <a href="/eduardolundgren/jquery-simulate/unstar" class="minibutton with-count js-toggler-target star-button starred upwards" title="Unstar this repo" data-remote="true" data-method="post" rel="nofollow">
        <span class="octicon octicon-star-delete"></span>
        <span class="text">Unstar</span>
      </a>
      <a href="/eduardolundgren/jquery-simulate/star" class="minibutton with-count js-toggler-target star-button unstarred upwards" title="Star this repo" data-remote="true" data-method="post" rel="nofollow">
        <span class="octicon octicon-star"></span>
        <span class="text">Star</span>
      </a>
      <a class="social-count js-social-count" href="/eduardolundgren/jquery-simulate/stargazers">48</a>
    </li>

        <li>
          <a href="/eduardolundgren/jquery-simulate/fork" class="minibutton with-count js-toggler-target fork-button lighter upwards" title="Fork this repo" rel="nofollow" data-method="post">
            <span class="octicon octicon-git-branch-create"></span>
            <span class="text">Fork</span>
          </a>
          <a href="/eduardolundgren/jquery-simulate/network" class="social-count">11</a>
        </li>


</ul>

              <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
                <span class="repo-label"><span>public</span></span>
                <span class="mega-octicon octicon-repo"></span>
                <span class="author vcard">
                  <a href="/eduardolundgren" class="url fn" itemprop="url" rel="author">
                  <span itemprop="title">eduardolundgren</span>
                  </a></span> /
                <strong><a href="/eduardolundgren/jquery-simulate" class="js-current-repository">jquery-simulate</a></strong>
              </h1>
            </div>

            
  <ul class="tabs">
    <li class="pulse-nav"><a href="/eduardolundgren/jquery-simulate/pulse" class="js-selected-navigation-item " data-selected-links="pulse /eduardolundgren/jquery-simulate/pulse" rel="nofollow"><span class="octicon octicon-pulse"></span></a></li>
    <li><a href="/eduardolundgren/jquery-simulate" class="js-selected-navigation-item selected" data-selected-links="repo_source repo_downloads repo_commits repo_tags repo_branches /eduardolundgren/jquery-simulate">Code</a></li>
    <li><a href="/eduardolundgren/jquery-simulate/network" class="js-selected-navigation-item " data-selected-links="repo_network /eduardolundgren/jquery-simulate/network">Network</a></li>
    <li><a href="/eduardolundgren/jquery-simulate/pulls" class="js-selected-navigation-item " data-selected-links="repo_pulls /eduardolundgren/jquery-simulate/pulls">Pull Requests <span class='counter'>2</span></a></li>

      <li><a href="/eduardolundgren/jquery-simulate/issues" class="js-selected-navigation-item " data-selected-links="repo_issues /eduardolundgren/jquery-simulate/issues">Issues <span class='counter'>4</span></a></li>

      <li><a href="/eduardolundgren/jquery-simulate/wiki" class="js-selected-navigation-item " data-selected-links="repo_wiki /eduardolundgren/jquery-simulate/wiki">Wiki</a></li>


    <li><a href="/eduardolundgren/jquery-simulate/graphs" class="js-selected-navigation-item " data-selected-links="repo_graphs repo_contributors /eduardolundgren/jquery-simulate/graphs">Graphs</a></li>


  </ul>
  
<div class="tabnav">

  <span class="tabnav-right">
    <ul class="tabnav-tabs">
          <li><a href="/eduardolundgren/jquery-simulate/tags" class="js-selected-navigation-item tabnav-tab" data-selected-links="repo_tags /eduardolundgren/jquery-simulate/tags">Tags <span class="counter blank">0</span></a></li>
    </ul>
  </span>

  <div class="tabnav-widget scope">


    <div class="select-menu js-menu-container js-select-menu js-branch-menu">
      <a class="minibutton select-menu-button js-menu-target" data-hotkey="w" data-ref="master">
        <span class="octicon octicon-git-branch"></span>
        <i>branch:</i>
        <span class="js-select-button">master</span>
      </a>

      <div class="select-menu-modal-holder js-menu-content js-navigation-container">

        <div class="select-menu-modal">
          <div class="select-menu-header">
            <span class="select-menu-title">Switch branches/tags</span>
            <span class="octicon octicon-remove-close js-menu-close"></span>
          </div> <!-- /.select-menu-header -->

          <div class="select-menu-filters">
            <div class="select-menu-text-filter">
              <input type="text" id="commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Filter branches/tags">
            </div>
            <div class="select-menu-tabs">
              <ul>
                <li class="select-menu-tab">
                  <a href="#" data-tab-filter="branches" class="js-select-menu-tab">Branches</a>
                </li>
                <li class="select-menu-tab">
                  <a href="#" data-tab-filter="tags" class="js-select-menu-tab">Tags</a>
                </li>
              </ul>
            </div><!-- /.select-menu-tabs -->
          </div><!-- /.select-menu-filters -->

          <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket css-truncate" data-tab-filter="branches">

            <div data-filterable-for="commitish-filter-field" data-filterable-type="substring">

                <div class="select-menu-item js-navigation-item ">
                  <span class="select-menu-item-icon octicon octicon-check"></span>
                  <a href="/eduardolundgren/jquery-simulate/blob/changes/jquery.simulate.js" class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target" data-name="changes" rel="nofollow" title="changes">changes</a>
                </div> <!-- /.select-menu-item -->
                <div class="select-menu-item js-navigation-item selected">
                  <span class="select-menu-item-icon octicon octicon-check"></span>
                  <a href="/eduardolundgren/jquery-simulate/blob/master/jquery.simulate.js" class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target" data-name="master" rel="nofollow" title="master">master</a>
                </div> <!-- /.select-menu-item -->
                <div class="select-menu-item js-navigation-item ">
                  <span class="select-menu-item-icon octicon octicon-check"></span>
                  <a href="/eduardolundgren/jquery-simulate/blob/pull-4/jquery.simulate.js" class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target" data-name="pull-4" rel="nofollow" title="pull-4">pull-4</a>
                </div> <!-- /.select-menu-item -->
            </div>

              <div class="select-menu-no-results">Nothing to show</div>
          </div> <!-- /.select-menu-list -->


          <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket css-truncate" data-tab-filter="tags">
            <div data-filterable-for="commitish-filter-field" data-filterable-type="substring">

            </div>

            <div class="select-menu-no-results">Nothing to show</div>

          </div> <!-- /.select-menu-list -->

        </div> <!-- /.select-menu-modal -->
      </div> <!-- /.select-menu-modal-holder -->
    </div> <!-- /.select-menu -->

  </div> <!-- /.scope -->

  <ul class="tabnav-tabs">
    <li><a href="/eduardolundgren/jquery-simulate" class="selected js-selected-navigation-item tabnav-tab" data-selected-links="repo_source /eduardolundgren/jquery-simulate">Files</a></li>
    <li><a href="/eduardolundgren/jquery-simulate/commits/master" class="js-selected-navigation-item tabnav-tab" data-selected-links="repo_commits /eduardolundgren/jquery-simulate/commits/master">Commits</a></li>
    <li><a href="/eduardolundgren/jquery-simulate/branches" class="js-selected-navigation-item tabnav-tab" data-selected-links="repo_branches /eduardolundgren/jquery-simulate/branches" rel="nofollow">Branches <span class="counter ">3</span></a></li>
  </ul>

</div>

  
  
  


            
          </div>
        </div><!-- /.repohead -->

        <div id="js-repo-pjax-container" class="container context-loader-container" data-pjax-container>
          


<!-- blob contrib key: blob_contributors:v21:9931dd4a43607d10ee8d9218cb5cdf7e -->
<!-- blob contrib frag key: views10/v8/blob_contributors:v21:9931dd4a43607d10ee8d9218cb5cdf7e -->

<div id="slider">
    <div class="frame-meta">

      <p title="This is a placeholder element" class="js-history-link-replace hidden"></p>

        <a href="/eduardolundgren/jquery-simulate/find/master" class="js-slide-to" data-hotkey="t" style="display:none">Show File Finder</a>

        <div class="breadcrumb">
          <span class='repo-root js-repo-root'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/eduardolundgren/jquery-simulate" class="js-slide-to" data-branch="master" data-direction="back" itemscope="url"><span itemprop="title">jquery-simulate</span></a></span></span><span class="separator"> / </span><strong class="final-path">jquery.simulate.js</strong> <span class="js-zeroclipboard zeroclipboard-button" data-clipboard-text="jquery.simulate.js" data-copied-hint="copied!" title="copy to clipboard"><span class="octicon octicon-clippy"></span></span>
        </div>


        
  <div class="commit file-history-tease">
    <img class="main-avatar" height="24" src="https://secure.gravatar.com/avatar/42327de520e674a6d1686845b30778d0?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png" width="24" />
    <span class="author"><a href="/eduardolundgren" rel="author">eduardolundgren</a></span>
    <time class="js-relative-date" datetime="2009-10-22T14:33:54-07:00" title="2009-10-22 14:33:54">October 22, 2009</time>
    <div class="commit-title">
        <a href="/eduardolundgren/jquery-simulate/commit/20173772227272fe17a17834802791fd86157d63" class="message" data-pjax="true">jQuery Simulate first commit</a>
    </div>

    <div class="participation">
      <p class="quickstat"><a href="#blob_contributors_box" rel="facebox"><strong>1</strong> contributor</a></p>
      
    </div>
    <div id="blob_contributors_box" style="display:none">
      <h2 class="facebox-header">Users who have contributed to this file</h2>
      <ul class="facebox-user-list">
        <li class="facebox-user-list-item">
          <img height="24" src="https://secure.gravatar.com/avatar/42327de520e674a6d1686845b30778d0?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png" width="24" />
          <a href="/eduardolundgren">eduardolundgren</a>
        </li>
      </ul>
    </div>
  </div>


    </div><!-- ./.frame-meta -->

    <div class="frames">
      <div class="frame" data-permalink-url="/eduardolundgren/jquery-simulate/blob/20173772227272fe17a17834802791fd86157d63/jquery.simulate.js" data-title="jquery-simulate/jquery.simulate.js at master · eduardolundgren/jquery-simulate · GitHub" data-type="blob">

        <div id="files" class="bubble">
          <div class="file">
            <div class="meta">
              <div class="info">
                <span class="icon"><b class="octicon octicon-file-text"></b></span>
                <span class="mode" title="File Mode">file</span>
                  <span>153 lines (139 sloc)</span>
                <span>4.308 kb</span>
              </div>
              <div class="actions">
                <div class="button-group">
                        <a class="minibutton tooltipped leftwards"
                           title="Clicking this button will automatically fork this project so you can edit the file"
                           href="/eduardolundgren/jquery-simulate/edit/master/jquery.simulate.js"
                           data-method="post" rel="nofollow">Edit</a>
                  <a href="/eduardolundgren/jquery-simulate/raw/master/jquery.simulate.js" class="button minibutton " id="raw-url">Raw</a>
                    <a href="/eduardolundgren/jquery-simulate/blame/master/jquery.simulate.js" class="button minibutton ">Blame</a>
                  <a href="/eduardolundgren/jquery-simulate/commits/master/jquery.simulate.js" class="button minibutton " rel="nofollow">History</a>
                </div><!-- /.button-group -->
              </div><!-- /.actions -->

            </div>
                <div class="blob-wrapper data type-javascript js-blob-data">
      <table class="file-code file-diff">
        <tr class="file-code-line">
          <td class="blob-line-nums">
            <span id="L1" rel="#L1">1</span>
<span id="L2" rel="#L2">2</span>
<span id="L3" rel="#L3">3</span>
<span id="L4" rel="#L4">4</span>
<span id="L5" rel="#L5">5</span>
<span id="L6" rel="#L6">6</span>
<span id="L7" rel="#L7">7</span>
<span id="L8" rel="#L8">8</span>
<span id="L9" rel="#L9">9</span>
<span id="L10" rel="#L10">10</span>
<span id="L11" rel="#L11">11</span>
<span id="L12" rel="#L12">12</span>
<span id="L13" rel="#L13">13</span>
<span id="L14" rel="#L14">14</span>
<span id="L15" rel="#L15">15</span>
<span id="L16" rel="#L16">16</span>
<span id="L17" rel="#L17">17</span>
<span id="L18" rel="#L18">18</span>
<span id="L19" rel="#L19">19</span>
<span id="L20" rel="#L20">20</span>
<span id="L21" rel="#L21">21</span>
<span id="L22" rel="#L22">22</span>
<span id="L23" rel="#L23">23</span>
<span id="L24" rel="#L24">24</span>
<span id="L25" rel="#L25">25</span>
<span id="L26" rel="#L26">26</span>
<span id="L27" rel="#L27">27</span>
<span id="L28" rel="#L28">28</span>
<span id="L29" rel="#L29">29</span>
<span id="L30" rel="#L30">30</span>
<span id="L31" rel="#L31">31</span>
<span id="L32" rel="#L32">32</span>
<span id="L33" rel="#L33">33</span>
<span id="L34" rel="#L34">34</span>
<span id="L35" rel="#L35">35</span>
<span id="L36" rel="#L36">36</span>
<span id="L37" rel="#L37">37</span>
<span id="L38" rel="#L38">38</span>
<span id="L39" rel="#L39">39</span>
<span id="L40" rel="#L40">40</span>
<span id="L41" rel="#L41">41</span>
<span id="L42" rel="#L42">42</span>
<span id="L43" rel="#L43">43</span>
<span id="L44" rel="#L44">44</span>
<span id="L45" rel="#L45">45</span>
<span id="L46" rel="#L46">46</span>
<span id="L47" rel="#L47">47</span>
<span id="L48" rel="#L48">48</span>
<span id="L49" rel="#L49">49</span>
<span id="L50" rel="#L50">50</span>
<span id="L51" rel="#L51">51</span>
<span id="L52" rel="#L52">52</span>
<span id="L53" rel="#L53">53</span>
<span id="L54" rel="#L54">54</span>
<span id="L55" rel="#L55">55</span>
<span id="L56" rel="#L56">56</span>
<span id="L57" rel="#L57">57</span>
<span id="L58" rel="#L58">58</span>
<span id="L59" rel="#L59">59</span>
<span id="L60" rel="#L60">60</span>
<span id="L61" rel="#L61">61</span>
<span id="L62" rel="#L62">62</span>
<span id="L63" rel="#L63">63</span>
<span id="L64" rel="#L64">64</span>
<span id="L65" rel="#L65">65</span>
<span id="L66" rel="#L66">66</span>
<span id="L67" rel="#L67">67</span>
<span id="L68" rel="#L68">68</span>
<span id="L69" rel="#L69">69</span>
<span id="L70" rel="#L70">70</span>
<span id="L71" rel="#L71">71</span>
<span id="L72" rel="#L72">72</span>
<span id="L73" rel="#L73">73</span>
<span id="L74" rel="#L74">74</span>
<span id="L75" rel="#L75">75</span>
<span id="L76" rel="#L76">76</span>
<span id="L77" rel="#L77">77</span>
<span id="L78" rel="#L78">78</span>
<span id="L79" rel="#L79">79</span>
<span id="L80" rel="#L80">80</span>
<span id="L81" rel="#L81">81</span>
<span id="L82" rel="#L82">82</span>
<span id="L83" rel="#L83">83</span>
<span id="L84" rel="#L84">84</span>
<span id="L85" rel="#L85">85</span>
<span id="L86" rel="#L86">86</span>
<span id="L87" rel="#L87">87</span>
<span id="L88" rel="#L88">88</span>
<span id="L89" rel="#L89">89</span>
<span id="L90" rel="#L90">90</span>
<span id="L91" rel="#L91">91</span>
<span id="L92" rel="#L92">92</span>
<span id="L93" rel="#L93">93</span>
<span id="L94" rel="#L94">94</span>
<span id="L95" rel="#L95">95</span>
<span id="L96" rel="#L96">96</span>
<span id="L97" rel="#L97">97</span>
<span id="L98" rel="#L98">98</span>
<span id="L99" rel="#L99">99</span>
<span id="L100" rel="#L100">100</span>
<span id="L101" rel="#L101">101</span>
<span id="L102" rel="#L102">102</span>
<span id="L103" rel="#L103">103</span>
<span id="L104" rel="#L104">104</span>
<span id="L105" rel="#L105">105</span>
<span id="L106" rel="#L106">106</span>
<span id="L107" rel="#L107">107</span>
<span id="L108" rel="#L108">108</span>
<span id="L109" rel="#L109">109</span>
<span id="L110" rel="#L110">110</span>
<span id="L111" rel="#L111">111</span>
<span id="L112" rel="#L112">112</span>
<span id="L113" rel="#L113">113</span>
<span id="L114" rel="#L114">114</span>
<span id="L115" rel="#L115">115</span>
<span id="L116" rel="#L116">116</span>
<span id="L117" rel="#L117">117</span>
<span id="L118" rel="#L118">118</span>
<span id="L119" rel="#L119">119</span>
<span id="L120" rel="#L120">120</span>
<span id="L121" rel="#L121">121</span>
<span id="L122" rel="#L122">122</span>
<span id="L123" rel="#L123">123</span>
<span id="L124" rel="#L124">124</span>
<span id="L125" rel="#L125">125</span>
<span id="L126" rel="#L126">126</span>
<span id="L127" rel="#L127">127</span>
<span id="L128" rel="#L128">128</span>
<span id="L129" rel="#L129">129</span>
<span id="L130" rel="#L130">130</span>
<span id="L131" rel="#L131">131</span>
<span id="L132" rel="#L132">132</span>
<span id="L133" rel="#L133">133</span>
<span id="L134" rel="#L134">134</span>
<span id="L135" rel="#L135">135</span>
<span id="L136" rel="#L136">136</span>
<span id="L137" rel="#L137">137</span>
<span id="L138" rel="#L138">138</span>
<span id="L139" rel="#L139">139</span>
<span id="L140" rel="#L140">140</span>
<span id="L141" rel="#L141">141</span>
<span id="L142" rel="#L142">142</span>
<span id="L143" rel="#L143">143</span>
<span id="L144" rel="#L144">144</span>
<span id="L145" rel="#L145">145</span>
<span id="L146" rel="#L146">146</span>
<span id="L147" rel="#L147">147</span>
<span id="L148" rel="#L148">148</span>
<span id="L149" rel="#L149">149</span>
<span id="L150" rel="#L150">150</span>
<span id="L151" rel="#L151">151</span>
<span id="L152" rel="#L152">152</span>

          </td>
          <td class="blob-line-code">
                  <div class="highlight"><pre><div class='line' id='LC1'><span class="cm">/*</span></div><div class='line' id='LC2'><span class="cm"> * jquery.simulate - simulate browser mouse and keyboard events</span></div><div class='line' id='LC3'><span class="cm"> *</span></div><div class='line' id='LC4'><span class="cm"> * Copyright (c) 2009 Eduardo Lundgren (eduardolundgren@gmail.com)</span></div><div class='line' id='LC5'><span class="cm"> * and Richard D. Worth (rdworth@gmail.com)</span></div><div class='line' id='LC6'><span class="cm"> *</span></div><div class='line' id='LC7'><span class="cm"> * Dual licensed under the MIT (http://www.opensource.org/licenses/mit-license.php) </span></div><div class='line' id='LC8'><span class="cm"> * and GPL (http://www.opensource.org/licenses/gpl-license.php) licenses.</span></div><div class='line' id='LC9'><span class="cm"> *</span></div><div class='line' id='LC10'><span class="cm"> */</span></div><div class='line' id='LC11'><br/></div><div class='line' id='LC12'><span class="p">;(</span><span class="kd">function</span><span class="p">(</span><span class="nx">$</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC13'><br/></div><div class='line' id='LC14'><span class="nx">$</span><span class="p">.</span><span class="nx">fn</span><span class="p">.</span><span class="nx">extend</span><span class="p">({</span></div><div class='line' id='LC15'>	<span class="nx">simulate</span><span class="o">:</span> <span class="kd">function</span><span class="p">(</span><span class="nx">type</span><span class="p">,</span> <span class="nx">options</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC16'>		<span class="k">return</span> <span class="k">this</span><span class="p">.</span><span class="nx">each</span><span class="p">(</span><span class="kd">function</span><span class="p">()</span> <span class="p">{</span></div><div class='line' id='LC17'>			<span class="kd">var</span> <span class="nx">opt</span> <span class="o">=</span> <span class="nx">$</span><span class="p">.</span><span class="nx">extend</span><span class="p">({},</span> <span class="nx">$</span><span class="p">.</span><span class="nx">simulate</span><span class="p">.</span><span class="nx">defaults</span><span class="p">,</span> <span class="nx">options</span> <span class="o">||</span> <span class="p">{});</span></div><div class='line' id='LC18'>			<span class="k">new</span> <span class="nx">$</span><span class="p">.</span><span class="nx">simulate</span><span class="p">(</span><span class="k">this</span><span class="p">,</span> <span class="nx">type</span><span class="p">,</span> <span class="nx">opt</span><span class="p">);</span></div><div class='line' id='LC19'>		<span class="p">});</span></div><div class='line' id='LC20'>	<span class="p">}</span></div><div class='line' id='LC21'><span class="p">});</span></div><div class='line' id='LC22'><br/></div><div class='line' id='LC23'><span class="nx">$</span><span class="p">.</span><span class="nx">simulate</span> <span class="o">=</span> <span class="kd">function</span><span class="p">(</span><span class="nx">el</span><span class="p">,</span> <span class="nx">type</span><span class="p">,</span> <span class="nx">options</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC24'>	<span class="k">this</span><span class="p">.</span><span class="nx">target</span> <span class="o">=</span> <span class="nx">el</span><span class="p">;</span></div><div class='line' id='LC25'>	<span class="k">this</span><span class="p">.</span><span class="nx">options</span> <span class="o">=</span> <span class="nx">options</span><span class="p">;</span></div><div class='line' id='LC26'><br/></div><div class='line' id='LC27'>	<span class="k">if</span> <span class="p">(</span><span class="sr">/^drag$/</span><span class="p">.</span><span class="nx">test</span><span class="p">(</span><span class="nx">type</span><span class="p">))</span> <span class="p">{</span></div><div class='line' id='LC28'>		<span class="k">this</span><span class="p">[</span><span class="nx">type</span><span class="p">].</span><span class="nx">apply</span><span class="p">(</span><span class="k">this</span><span class="p">,</span> <span class="p">[</span><span class="k">this</span><span class="p">.</span><span class="nx">target</span><span class="p">,</span> <span class="nx">options</span><span class="p">]);</span></div><div class='line' id='LC29'>	<span class="p">}</span> <span class="k">else</span> <span class="p">{</span></div><div class='line' id='LC30'>		<span class="k">this</span><span class="p">.</span><span class="nx">simulateEvent</span><span class="p">(</span><span class="nx">el</span><span class="p">,</span> <span class="nx">type</span><span class="p">,</span> <span class="nx">options</span><span class="p">);</span></div><div class='line' id='LC31'>	<span class="p">}</span></div><div class='line' id='LC32'><span class="p">}</span></div><div class='line' id='LC33'><br/></div><div class='line' id='LC34'><span class="nx">$</span><span class="p">.</span><span class="nx">extend</span><span class="p">(</span><span class="nx">$</span><span class="p">.</span><span class="nx">simulate</span><span class="p">.</span><span class="nx">prototype</span><span class="p">,</span> <span class="p">{</span></div><div class='line' id='LC35'>	<span class="nx">simulateEvent</span><span class="o">:</span> <span class="kd">function</span><span class="p">(</span><span class="nx">el</span><span class="p">,</span> <span class="nx">type</span><span class="p">,</span> <span class="nx">options</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC36'>		<span class="kd">var</span> <span class="nx">evt</span> <span class="o">=</span> <span class="k">this</span><span class="p">.</span><span class="nx">createEvent</span><span class="p">(</span><span class="nx">type</span><span class="p">,</span> <span class="nx">options</span><span class="p">);</span></div><div class='line' id='LC37'>		<span class="k">this</span><span class="p">.</span><span class="nx">dispatchEvent</span><span class="p">(</span><span class="nx">el</span><span class="p">,</span> <span class="nx">type</span><span class="p">,</span> <span class="nx">evt</span><span class="p">,</span> <span class="nx">options</span><span class="p">);</span></div><div class='line' id='LC38'>		<span class="k">return</span> <span class="nx">evt</span><span class="p">;</span></div><div class='line' id='LC39'>	<span class="p">},</span></div><div class='line' id='LC40'>	<span class="nx">createEvent</span><span class="o">:</span> <span class="kd">function</span><span class="p">(</span><span class="nx">type</span><span class="p">,</span> <span class="nx">options</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC41'>		<span class="k">if</span> <span class="p">(</span><span class="sr">/^mouse(over|out|down|up|move)|(dbl)?click$/</span><span class="p">.</span><span class="nx">test</span><span class="p">(</span><span class="nx">type</span><span class="p">))</span> <span class="p">{</span></div><div class='line' id='LC42'>			<span class="k">return</span> <span class="k">this</span><span class="p">.</span><span class="nx">mouseEvent</span><span class="p">(</span><span class="nx">type</span><span class="p">,</span> <span class="nx">options</span><span class="p">);</span></div><div class='line' id='LC43'>		<span class="p">}</span> <span class="k">else</span> <span class="k">if</span> <span class="p">(</span><span class="sr">/^key(up|down|press)$/</span><span class="p">.</span><span class="nx">test</span><span class="p">(</span><span class="nx">type</span><span class="p">))</span> <span class="p">{</span></div><div class='line' id='LC44'>			<span class="k">return</span> <span class="k">this</span><span class="p">.</span><span class="nx">keyboardEvent</span><span class="p">(</span><span class="nx">type</span><span class="p">,</span> <span class="nx">options</span><span class="p">);</span></div><div class='line' id='LC45'>		<span class="p">}</span></div><div class='line' id='LC46'>	<span class="p">},</span></div><div class='line' id='LC47'>	<span class="nx">mouseEvent</span><span class="o">:</span> <span class="kd">function</span><span class="p">(</span><span class="nx">type</span><span class="p">,</span> <span class="nx">options</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC48'>		<span class="kd">var</span> <span class="nx">evt</span><span class="p">;</span></div><div class='line' id='LC49'>		<span class="kd">var</span> <span class="nx">e</span> <span class="o">=</span> <span class="nx">$</span><span class="p">.</span><span class="nx">extend</span><span class="p">({</span></div><div class='line' id='LC50'>			<span class="nx">bubbles</span><span class="o">:</span> <span class="kc">true</span><span class="p">,</span> <span class="nx">cancelable</span><span class="o">:</span> <span class="p">(</span><span class="nx">type</span> <span class="o">!=</span> <span class="s2">&quot;mousemove&quot;</span><span class="p">),</span> <span class="nx">view</span><span class="o">:</span> <span class="nb">window</span><span class="p">,</span> <span class="nx">detail</span><span class="o">:</span> <span class="mi">0</span><span class="p">,</span></div><div class='line' id='LC51'>			<span class="nx">screenX</span><span class="o">:</span> <span class="mi">0</span><span class="p">,</span> <span class="nx">screenY</span><span class="o">:</span> <span class="mi">0</span><span class="p">,</span> <span class="nx">clientX</span><span class="o">:</span> <span class="mi">0</span><span class="p">,</span> <span class="nx">clientY</span><span class="o">:</span> <span class="mi">0</span><span class="p">,</span></div><div class='line' id='LC52'>			<span class="nx">ctrlKey</span><span class="o">:</span> <span class="kc">false</span><span class="p">,</span> <span class="nx">altKey</span><span class="o">:</span> <span class="kc">false</span><span class="p">,</span> <span class="nx">shiftKey</span><span class="o">:</span> <span class="kc">false</span><span class="p">,</span> <span class="nx">metaKey</span><span class="o">:</span> <span class="kc">false</span><span class="p">,</span></div><div class='line' id='LC53'>			<span class="nx">button</span><span class="o">:</span> <span class="mi">0</span><span class="p">,</span> <span class="nx">relatedTarget</span><span class="o">:</span> <span class="kc">undefined</span></div><div class='line' id='LC54'>		<span class="p">},</span> <span class="nx">options</span><span class="p">);</span></div><div class='line' id='LC55'><br/></div><div class='line' id='LC56'>		<span class="kd">var</span> <span class="nx">relatedTarget</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="nx">e</span><span class="p">.</span><span class="nx">relatedTarget</span><span class="p">)[</span><span class="mi">0</span><span class="p">];</span></div><div class='line' id='LC57'><br/></div><div class='line' id='LC58'>		<span class="k">if</span> <span class="p">(</span><span class="nx">$</span><span class="p">.</span><span class="nx">isFunction</span><span class="p">(</span><span class="nb">document</span><span class="p">.</span><span class="nx">createEvent</span><span class="p">))</span> <span class="p">{</span></div><div class='line' id='LC59'>			<span class="nx">evt</span> <span class="o">=</span> <span class="nb">document</span><span class="p">.</span><span class="nx">createEvent</span><span class="p">(</span><span class="s2">&quot;MouseEvents&quot;</span><span class="p">);</span></div><div class='line' id='LC60'>			<span class="nx">evt</span><span class="p">.</span><span class="nx">initMouseEvent</span><span class="p">(</span><span class="nx">type</span><span class="p">,</span> <span class="nx">e</span><span class="p">.</span><span class="nx">bubbles</span><span class="p">,</span> <span class="nx">e</span><span class="p">.</span><span class="nx">cancelable</span><span class="p">,</span> <span class="nx">e</span><span class="p">.</span><span class="nx">view</span><span class="p">,</span> <span class="nx">e</span><span class="p">.</span><span class="nx">detail</span><span class="p">,</span></div><div class='line' id='LC61'>				<span class="nx">e</span><span class="p">.</span><span class="nx">screenX</span><span class="p">,</span> <span class="nx">e</span><span class="p">.</span><span class="nx">screenY</span><span class="p">,</span> <span class="nx">e</span><span class="p">.</span><span class="nx">clientX</span><span class="p">,</span> <span class="nx">e</span><span class="p">.</span><span class="nx">clientY</span><span class="p">,</span></div><div class='line' id='LC62'>				<span class="nx">e</span><span class="p">.</span><span class="nx">ctrlKey</span><span class="p">,</span> <span class="nx">e</span><span class="p">.</span><span class="nx">altKey</span><span class="p">,</span> <span class="nx">e</span><span class="p">.</span><span class="nx">shiftKey</span><span class="p">,</span> <span class="nx">e</span><span class="p">.</span><span class="nx">metaKey</span><span class="p">,</span></div><div class='line' id='LC63'>				<span class="nx">e</span><span class="p">.</span><span class="nx">button</span><span class="p">,</span> <span class="nx">e</span><span class="p">.</span><span class="nx">relatedTarget</span> <span class="o">||</span> <span class="nb">document</span><span class="p">.</span><span class="nx">body</span><span class="p">.</span><span class="nx">parentNode</span><span class="p">);</span></div><div class='line' id='LC64'>		<span class="p">}</span> <span class="k">else</span> <span class="k">if</span> <span class="p">(</span><span class="nb">document</span><span class="p">.</span><span class="nx">createEventObject</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC65'>			<span class="nx">evt</span> <span class="o">=</span> <span class="nb">document</span><span class="p">.</span><span class="nx">createEventObject</span><span class="p">();</span></div><div class='line' id='LC66'>			<span class="nx">$</span><span class="p">.</span><span class="nx">extend</span><span class="p">(</span><span class="nx">evt</span><span class="p">,</span> <span class="nx">e</span><span class="p">);</span></div><div class='line' id='LC67'>			<span class="nx">evt</span><span class="p">.</span><span class="nx">button</span> <span class="o">=</span> <span class="p">{</span> <span class="mi">0</span><span class="o">:</span><span class="mi">1</span><span class="p">,</span> <span class="mi">1</span><span class="o">:</span><span class="mi">4</span><span class="p">,</span> <span class="mi">2</span><span class="o">:</span><span class="mi">2</span> <span class="p">}[</span><span class="nx">evt</span><span class="p">.</span><span class="nx">button</span><span class="p">]</span> <span class="o">||</span> <span class="nx">evt</span><span class="p">.</span><span class="nx">button</span><span class="p">;</span></div><div class='line' id='LC68'>		<span class="p">}</span></div><div class='line' id='LC69'>		<span class="k">return</span> <span class="nx">evt</span><span class="p">;</span></div><div class='line' id='LC70'>	<span class="p">},</span></div><div class='line' id='LC71'>	<span class="nx">keyboardEvent</span><span class="o">:</span> <span class="kd">function</span><span class="p">(</span><span class="nx">type</span><span class="p">,</span> <span class="nx">options</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC72'>		<span class="kd">var</span> <span class="nx">evt</span><span class="p">;</span></div><div class='line' id='LC73'><br/></div><div class='line' id='LC74'>		<span class="kd">var</span> <span class="nx">e</span> <span class="o">=</span> <span class="nx">$</span><span class="p">.</span><span class="nx">extend</span><span class="p">({</span> <span class="nx">bubbles</span><span class="o">:</span> <span class="kc">true</span><span class="p">,</span> <span class="nx">cancelable</span><span class="o">:</span> <span class="kc">true</span><span class="p">,</span> <span class="nx">view</span><span class="o">:</span> <span class="nb">window</span><span class="p">,</span></div><div class='line' id='LC75'>			<span class="nx">ctrlKey</span><span class="o">:</span> <span class="kc">false</span><span class="p">,</span> <span class="nx">altKey</span><span class="o">:</span> <span class="kc">false</span><span class="p">,</span> <span class="nx">shiftKey</span><span class="o">:</span> <span class="kc">false</span><span class="p">,</span> <span class="nx">metaKey</span><span class="o">:</span> <span class="kc">false</span><span class="p">,</span></div><div class='line' id='LC76'>			<span class="nx">keyCode</span><span class="o">:</span> <span class="mi">0</span><span class="p">,</span> <span class="nx">charCode</span><span class="o">:</span> <span class="mi">0</span></div><div class='line' id='LC77'>		<span class="p">},</span> <span class="nx">options</span><span class="p">);</span></div><div class='line' id='LC78'><br/></div><div class='line' id='LC79'>		<span class="k">if</span> <span class="p">(</span><span class="nx">$</span><span class="p">.</span><span class="nx">isFunction</span><span class="p">(</span><span class="nb">document</span><span class="p">.</span><span class="nx">createEvent</span><span class="p">))</span> <span class="p">{</span></div><div class='line' id='LC80'>			<span class="k">try</span> <span class="p">{</span></div><div class='line' id='LC81'>				<span class="nx">evt</span> <span class="o">=</span> <span class="nb">document</span><span class="p">.</span><span class="nx">createEvent</span><span class="p">(</span><span class="s2">&quot;KeyEvents&quot;</span><span class="p">);</span></div><div class='line' id='LC82'>				<span class="nx">evt</span><span class="p">.</span><span class="nx">initKeyEvent</span><span class="p">(</span><span class="nx">type</span><span class="p">,</span> <span class="nx">e</span><span class="p">.</span><span class="nx">bubbles</span><span class="p">,</span> <span class="nx">e</span><span class="p">.</span><span class="nx">cancelable</span><span class="p">,</span> <span class="nx">e</span><span class="p">.</span><span class="nx">view</span><span class="p">,</span></div><div class='line' id='LC83'>					<span class="nx">e</span><span class="p">.</span><span class="nx">ctrlKey</span><span class="p">,</span> <span class="nx">e</span><span class="p">.</span><span class="nx">altKey</span><span class="p">,</span> <span class="nx">e</span><span class="p">.</span><span class="nx">shiftKey</span><span class="p">,</span> <span class="nx">e</span><span class="p">.</span><span class="nx">metaKey</span><span class="p">,</span></div><div class='line' id='LC84'>					<span class="nx">e</span><span class="p">.</span><span class="nx">keyCode</span><span class="p">,</span> <span class="nx">e</span><span class="p">.</span><span class="nx">charCode</span><span class="p">);</span></div><div class='line' id='LC85'>			<span class="p">}</span> <span class="k">catch</span><span class="p">(</span><span class="nx">err</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC86'>				<span class="nx">evt</span> <span class="o">=</span> <span class="nb">document</span><span class="p">.</span><span class="nx">createEvent</span><span class="p">(</span><span class="s2">&quot;Events&quot;</span><span class="p">);</span></div><div class='line' id='LC87'>				<span class="nx">evt</span><span class="p">.</span><span class="nx">initEvent</span><span class="p">(</span><span class="nx">type</span><span class="p">,</span> <span class="nx">e</span><span class="p">.</span><span class="nx">bubbles</span><span class="p">,</span> <span class="nx">e</span><span class="p">.</span><span class="nx">cancelable</span><span class="p">);</span></div><div class='line' id='LC88'>				<span class="nx">$</span><span class="p">.</span><span class="nx">extend</span><span class="p">(</span><span class="nx">evt</span><span class="p">,</span> <span class="p">{</span> <span class="nx">view</span><span class="o">:</span> <span class="nx">e</span><span class="p">.</span><span class="nx">view</span><span class="p">,</span></div><div class='line' id='LC89'>					<span class="nx">ctrlKey</span><span class="o">:</span> <span class="nx">e</span><span class="p">.</span><span class="nx">ctrlKey</span><span class="p">,</span> <span class="nx">altKey</span><span class="o">:</span> <span class="nx">e</span><span class="p">.</span><span class="nx">altKey</span><span class="p">,</span> <span class="nx">shiftKey</span><span class="o">:</span> <span class="nx">e</span><span class="p">.</span><span class="nx">shiftKey</span><span class="p">,</span> <span class="nx">metaKey</span><span class="o">:</span> <span class="nx">e</span><span class="p">.</span><span class="nx">metaKey</span><span class="p">,</span></div><div class='line' id='LC90'>					<span class="nx">keyCode</span><span class="o">:</span> <span class="nx">e</span><span class="p">.</span><span class="nx">keyCode</span><span class="p">,</span> <span class="nx">charCode</span><span class="o">:</span> <span class="nx">e</span><span class="p">.</span><span class="nx">charCode</span></div><div class='line' id='LC91'>				<span class="p">});</span></div><div class='line' id='LC92'>			<span class="p">}</span></div><div class='line' id='LC93'>		<span class="p">}</span> <span class="k">else</span> <span class="k">if</span> <span class="p">(</span><span class="nb">document</span><span class="p">.</span><span class="nx">createEventObject</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC94'>			<span class="nx">evt</span> <span class="o">=</span> <span class="nb">document</span><span class="p">.</span><span class="nx">createEventObject</span><span class="p">();</span></div><div class='line' id='LC95'>			<span class="nx">$</span><span class="p">.</span><span class="nx">extend</span><span class="p">(</span><span class="nx">evt</span><span class="p">,</span> <span class="nx">e</span><span class="p">);</span></div><div class='line' id='LC96'>		<span class="p">}</span></div><div class='line' id='LC97'>		<span class="k">if</span> <span class="p">(</span><span class="nx">$</span><span class="p">.</span><span class="nx">browser</span><span class="p">.</span><span class="nx">msie</span> <span class="o">||</span> <span class="nx">$</span><span class="p">.</span><span class="nx">browser</span><span class="p">.</span><span class="nx">opera</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC98'>			<span class="nx">evt</span><span class="p">.</span><span class="nx">keyCode</span> <span class="o">=</span> <span class="p">(</span><span class="nx">e</span><span class="p">.</span><span class="nx">charCode</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="p">)</span> <span class="o">?</span> <span class="nx">e</span><span class="p">.</span><span class="nx">charCode</span> <span class="o">:</span> <span class="nx">e</span><span class="p">.</span><span class="nx">keyCode</span><span class="p">;</span></div><div class='line' id='LC99'>			<span class="nx">evt</span><span class="p">.</span><span class="nx">charCode</span> <span class="o">=</span> <span class="kc">undefined</span><span class="p">;</span></div><div class='line' id='LC100'>		<span class="p">}</span></div><div class='line' id='LC101'>		<span class="k">return</span> <span class="nx">evt</span><span class="p">;</span></div><div class='line' id='LC102'>	<span class="p">},</span></div><div class='line' id='LC103'><br/></div><div class='line' id='LC104'>	<span class="nx">dispatchEvent</span><span class="o">:</span> <span class="kd">function</span><span class="p">(</span><span class="nx">el</span><span class="p">,</span> <span class="nx">type</span><span class="p">,</span> <span class="nx">evt</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC105'>		<span class="k">if</span> <span class="p">(</span><span class="nx">el</span><span class="p">.</span><span class="nx">dispatchEvent</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC106'>			<span class="nx">el</span><span class="p">.</span><span class="nx">dispatchEvent</span><span class="p">(</span><span class="nx">evt</span><span class="p">);</span></div><div class='line' id='LC107'>		<span class="p">}</span> <span class="k">else</span> <span class="k">if</span> <span class="p">(</span><span class="nx">el</span><span class="p">.</span><span class="nx">fireEvent</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC108'>			<span class="nx">el</span><span class="p">.</span><span class="nx">fireEvent</span><span class="p">(</span><span class="s1">&#39;on&#39;</span> <span class="o">+</span> <span class="nx">type</span><span class="p">,</span> <span class="nx">evt</span><span class="p">);</span></div><div class='line' id='LC109'>		<span class="p">}</span></div><div class='line' id='LC110'>		<span class="k">return</span> <span class="nx">evt</span><span class="p">;</span></div><div class='line' id='LC111'>	<span class="p">},</span></div><div class='line' id='LC112'><br/></div><div class='line' id='LC113'>	<span class="nx">drag</span><span class="o">:</span> <span class="kd">function</span><span class="p">(</span><span class="nx">el</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC114'>		<span class="kd">var</span> <span class="nx">self</span> <span class="o">=</span> <span class="k">this</span><span class="p">,</span> <span class="nx">center</span> <span class="o">=</span> <span class="k">this</span><span class="p">.</span><span class="nx">findCenter</span><span class="p">(</span><span class="k">this</span><span class="p">.</span><span class="nx">target</span><span class="p">),</span> </div><div class='line' id='LC115'>			<span class="nx">options</span> <span class="o">=</span> <span class="k">this</span><span class="p">.</span><span class="nx">options</span><span class="p">,</span>	<span class="nx">x</span> <span class="o">=</span> <span class="nb">Math</span><span class="p">.</span><span class="nx">floor</span><span class="p">(</span><span class="nx">center</span><span class="p">.</span><span class="nx">x</span><span class="p">),</span> <span class="nx">y</span> <span class="o">=</span> <span class="nb">Math</span><span class="p">.</span><span class="nx">floor</span><span class="p">(</span><span class="nx">center</span><span class="p">.</span><span class="nx">y</span><span class="p">),</span> </div><div class='line' id='LC116'>			<span class="nx">dx</span> <span class="o">=</span> <span class="nx">options</span><span class="p">.</span><span class="nx">dx</span> <span class="o">||</span> <span class="mi">0</span><span class="p">,</span> <span class="nx">dy</span> <span class="o">=</span> <span class="nx">options</span><span class="p">.</span><span class="nx">dy</span> <span class="o">||</span> <span class="mi">0</span><span class="p">,</span> <span class="nx">target</span> <span class="o">=</span> <span class="k">this</span><span class="p">.</span><span class="nx">target</span><span class="p">;</span></div><div class='line' id='LC117'>		<span class="kd">var</span> <span class="nx">coord</span> <span class="o">=</span> <span class="p">{</span> <span class="nx">clientX</span><span class="o">:</span> <span class="nx">x</span><span class="p">,</span> <span class="nx">clientY</span><span class="o">:</span> <span class="nx">y</span> <span class="p">};</span></div><div class='line' id='LC118'>		<span class="k">this</span><span class="p">.</span><span class="nx">simulateEvent</span><span class="p">(</span><span class="nx">target</span><span class="p">,</span> <span class="s2">&quot;mousedown&quot;</span><span class="p">,</span> <span class="nx">coord</span><span class="p">);</span></div><div class='line' id='LC119'>		<span class="nx">coord</span> <span class="o">=</span> <span class="p">{</span> <span class="nx">clientX</span><span class="o">:</span> <span class="nx">x</span> <span class="o">+</span> <span class="mi">1</span><span class="p">,</span> <span class="nx">clientY</span><span class="o">:</span> <span class="nx">y</span> <span class="o">+</span> <span class="mi">1</span> <span class="p">};</span></div><div class='line' id='LC120'>		<span class="k">this</span><span class="p">.</span><span class="nx">simulateEvent</span><span class="p">(</span><span class="nb">document</span><span class="p">,</span> <span class="s2">&quot;mousemove&quot;</span><span class="p">,</span> <span class="nx">coord</span><span class="p">);</span></div><div class='line' id='LC121'>		<span class="nx">coord</span> <span class="o">=</span> <span class="p">{</span> <span class="nx">clientX</span><span class="o">:</span> <span class="nx">x</span> <span class="o">+</span> <span class="nx">dx</span><span class="p">,</span> <span class="nx">clientY</span><span class="o">:</span> <span class="nx">y</span> <span class="o">+</span> <span class="nx">dy</span> <span class="p">};</span></div><div class='line' id='LC122'>		<span class="k">this</span><span class="p">.</span><span class="nx">simulateEvent</span><span class="p">(</span><span class="nb">document</span><span class="p">,</span> <span class="s2">&quot;mousemove&quot;</span><span class="p">,</span> <span class="nx">coord</span><span class="p">);</span></div><div class='line' id='LC123'>		<span class="k">this</span><span class="p">.</span><span class="nx">simulateEvent</span><span class="p">(</span><span class="nb">document</span><span class="p">,</span> <span class="s2">&quot;mousemove&quot;</span><span class="p">,</span> <span class="nx">coord</span><span class="p">);</span></div><div class='line' id='LC124'>		<span class="k">this</span><span class="p">.</span><span class="nx">simulateEvent</span><span class="p">(</span><span class="nx">target</span><span class="p">,</span> <span class="s2">&quot;mouseup&quot;</span><span class="p">,</span> <span class="nx">coord</span><span class="p">);</span></div><div class='line' id='LC125'>	<span class="p">},</span></div><div class='line' id='LC126'>	<span class="nx">findCenter</span><span class="o">:</span> <span class="kd">function</span><span class="p">(</span><span class="nx">el</span><span class="p">)</span> <span class="p">{</span></div><div class='line' id='LC127'>		<span class="kd">var</span> <span class="nx">el</span> <span class="o">=</span> <span class="nx">$</span><span class="p">(</span><span class="k">this</span><span class="p">.</span><span class="nx">target</span><span class="p">),</span> <span class="nx">o</span> <span class="o">=</span> <span class="nx">el</span><span class="p">.</span><span class="nx">offset</span><span class="p">();</span></div><div class='line' id='LC128'>		<span class="k">return</span> <span class="p">{</span></div><div class='line' id='LC129'>			<span class="nx">x</span><span class="o">:</span> <span class="nx">o</span><span class="p">.</span><span class="nx">left</span> <span class="o">+</span> <span class="nx">el</span><span class="p">.</span><span class="nx">outerWidth</span><span class="p">()</span> <span class="o">/</span> <span class="mi">2</span><span class="p">,</span></div><div class='line' id='LC130'>			<span class="nx">y</span><span class="o">:</span> <span class="nx">o</span><span class="p">.</span><span class="nx">top</span> <span class="o">+</span> <span class="nx">el</span><span class="p">.</span><span class="nx">outerHeight</span><span class="p">()</span> <span class="o">/</span> <span class="mi">2</span></div><div class='line' id='LC131'>		<span class="p">};</span></div><div class='line' id='LC132'>	<span class="p">}</span></div><div class='line' id='LC133'><span class="p">});</span></div><div class='line' id='LC134'><br/></div><div class='line' id='LC135'><span class="nx">$</span><span class="p">.</span><span class="nx">extend</span><span class="p">(</span><span class="nx">$</span><span class="p">.</span><span class="nx">simulate</span><span class="p">,</span> <span class="p">{</span></div><div class='line' id='LC136'>	<span class="nx">defaults</span><span class="o">:</span> <span class="p">{</span></div><div class='line' id='LC137'>		<span class="nx">speed</span><span class="o">:</span> <span class="s1">&#39;sync&#39;</span></div><div class='line' id='LC138'>	<span class="p">},</span></div><div class='line' id='LC139'>	<span class="nx">VK_TAB</span><span class="o">:</span> <span class="mi">9</span><span class="p">,</span></div><div class='line' id='LC140'>	<span class="nx">VK_ENTER</span><span class="o">:</span> <span class="mi">13</span><span class="p">,</span></div><div class='line' id='LC141'>	<span class="nx">VK_ESC</span><span class="o">:</span> <span class="mi">27</span><span class="p">,</span></div><div class='line' id='LC142'>	<span class="nx">VK_PGUP</span><span class="o">:</span> <span class="mi">33</span><span class="p">,</span></div><div class='line' id='LC143'>	<span class="nx">VK_PGDN</span><span class="o">:</span> <span class="mi">34</span><span class="p">,</span></div><div class='line' id='LC144'>	<span class="nx">VK_END</span><span class="o">:</span> <span class="mi">35</span><span class="p">,</span></div><div class='line' id='LC145'>	<span class="nx">VK_HOME</span><span class="o">:</span> <span class="mi">36</span><span class="p">,</span></div><div class='line' id='LC146'>	<span class="nx">VK_LEFT</span><span class="o">:</span> <span class="mi">37</span><span class="p">,</span></div><div class='line' id='LC147'>	<span class="nx">VK_UP</span><span class="o">:</span> <span class="mi">38</span><span class="p">,</span></div><div class='line' id='LC148'>	<span class="nx">VK_RIGHT</span><span class="o">:</span> <span class="mi">39</span><span class="p">,</span></div><div class='line' id='LC149'>	<span class="nx">VK_DOWN</span><span class="o">:</span> <span class="mi">40</span></div><div class='line' id='LC150'><span class="p">});</span></div><div class='line' id='LC151'><br/></div><div class='line' id='LC152'><span class="p">})(</span><span class="nx">jQuery</span><span class="p">);</span></div></pre></div>
          </td>
        </tr>
      </table>
  </div>

          </div>
        </div>

        <a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" class="js-jump-to-line" style="display:none">Jump to Line</a>
        <div id="jump-to-line" style="display:none">
          <form accept-charset="UTF-8" class="js-jump-to-line-form">
            <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;">
            <button type="submit" class="button">Go</button>
          </form>
        </div>

      </div>
    </div>
</div>

<div id="js-frame-loading-template" class="frame frame-loading large-loading-area" style="display:none;">
  <img class="js-frame-loading-spinner" src="https://a248.e.akamai.net/assets.github.com/images/spinners/octocat-spinner-128.gif" height="64" width="64">
</div>


        </div>
      </div>
      <div class="modal-backdrop"></div>
    </div>

    </div><!-- /.wrapper -->

      <div class="container">
  <div class="site-footer">
    <ul class="site-footer-links right">
      <li><a href="https://status.github.com/">Status</a></li>
      <li><a href="http://developer.github.com">Developer</a></li>
      <li><a href="http://training.github.com">Training</a></li>
      <li><a href="http://shop.github.com">Shop</a></li>
      <li><a href="/blog">Blog</a></li>
      <li><a href="/about">About</a></li>
    </ul>

    <a href="/">
      <span class="mega-octicon octicon-mark-github"></span>
    </a>

    <ul class="site-footer-links">
      <li>&copy; 2013 <span title="0.08200s from fe1.rs.github.com">GitHub</span>, Inc.</li>
        <li><a href="/site/terms">Terms</a></li>
        <li><a href="/site/privacy">Privacy</a></li>
        <li><a href="/security">Security</a></li>
        <li><a href="/contact">Contact</a></li>
    </ul>
  </div><!-- /.site-footer -->
</div><!-- /.container -->


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-fullscreen-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="js-fullscreen-contents" placeholder="" data-suggester="fullscreen_suggester"></textarea>
          <div class="suggester-container">
              <div class="suggester fullscreen-suggester js-navigation-container" id="fullscreen_suggester"
                 data-url="/eduardolundgren/jquery-simulate/suggestions/commit">
              </div>
          </div>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped leftwards" title="Exit Zen Mode">
      <span class="mega-octicon octicon-screen-normal"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped leftwards"
      title="Switch themes">
      <span class="octicon octicon-color-mode"></span>
    </a>
  </div>
</div>



    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <a href="#" class="octicon octicon-remove-close close ajax-error-dismiss"></a>
      Something went wrong with that request. Please try again.
    </div>

    
    <span id='server_response_time' data-time='0.08261' data-host='fe1'></span>
    
  </body>
</html>

