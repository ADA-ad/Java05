# Java05第５回目課題提出
    
### ①URLとは  
  URL(Uniform Resource Locator)情報の場所を指定する記述。いわゆる情報の住所のこと。 
### ②クエリ文字列とは  
https://example.com/pathparameter/{pathparameter} `?`  **queryparameter1=hogehoge&queryparameter2=fugafuga**        
URI の  `?` マークの後でつけるテキストであり、特定のリソースを操作して取得する際に必要な情報を入れます。  

<img width="268" alt="parameter" src="https://github.com/ADA-ad/Java05/assets/152973671/ba88d110-c25b-4ab5-817c-dd7641e9871c">　　

例え上の図のようなuserを束ねるgroupというテーブルがあり、そこから特定のグループ(グループ１)に紐づくユーザーを取得したいとします。     
この場合、groupId=１ は 特定のリソース識別するために必要な情報 なので設計と実際に叩くAPIは以下のようになります。   

設計⇩   
```https://example.com/groups/{group_id}```  
実際⇩    
```https://example.com/groups/1```  
### ③パス変数（パスパラメーター）とは   
https://example.com/ **pathparameter/{pathparameter}**  `?` queryparameter1=hogehoge&queryparameter2=fugafuga      
URI の  `?` マークの前につけるテキストであり、 特定のリソースを識別するために必要な情報を入れます。  

<img width="268" alt="parameter" src="https://github.com/ADA-ad/Java05/assets/152973671/ba88d110-c25b-4ab5-817c-dd7641e9871c">　　

例え上の図に特定のグループ(グループ１)に紐づくユーザーを3件、user_idの降順で取得したいとします。  
この場合、3件 と user_idの降順 という条件は 特定のリソースを操作して取得する際に必要な情報 なので設計と実際に叩くAPIは以下のようになります。

設計⇩   
```https://example.com/groups/{group_id}?sort=boolean&limit=number```  
実際⇩    
```https://example.com/groups/1?sort=false&limit=3```  

### ④クエリ文字列とパス変数の違いとは  
#### 見た目の違い  
```
①https://zenn.dev/search
②https://zenn.dev/search?q=Laravel
```

①と②の見た目違いとして「search」の後に「?〜」が」あるかどうか  
①のパスパラメータはsearchの部分になる  
②の場合、パスパラメータは①と同じくsearch、クエリパラメータは?q=Laravel   
#### 中身の違い  
*パスパラメータ* は特定のもの（画面など）を表示したいときに必要になります。  
*クエリパラメータ*は特定のもの（画面など）に条件を加える場合に必要になります。
### ⑤HTTPメソッドとは  
HTTPメソッドは、対象となるリソースに対して「何をしたいか」を指示する。  
具体的に言うと、HTTPリクエストを用いてwebサーバーに具体的な要求をしているのはHTTPリクエスト内に含まれるHTTPメソッドです。  
### ⑥ GET/POST/PUT/PATCH/DELETEとは  
<img width="520" alt="http" src="https://github.com/ADA-ad/Java05/assets/152973671/482de5d3-9a55-48e9-a2b2-436186f2108e">  

GETメソッドは、データの参照時に使用します。リクエスト元の手元で使えるように、データを取得します。  
- Webサイト閲覧（HTMLやCSS、画像、Javascriptの取得など）  
- APIを呼び出しデータ取得

POSTメソッドは、副作用（動作）を伴うデータを送ることができます。データを新規作成するときにも使用します。  
- 天気取得API（引数は市町村区など） 
- Webサイトの入力フォームからデータ送信 
- SNSでアカウントを新規作成 
- ブログ記事を新規投稿 
- Twitterでツイートする 
- Facebookでコメントを投稿する

PUTメソッドは、データの置換などの際に使用します。 
データが存在するかどうか分からないときに使用することが多いです。
更新対象や更新内容を付与してデータ送信することができます。 
- S3にあるURLにファイルをアップロードする 
- 存在する場合：更新 
- 存在しない場合：新規作成 

### ⑦リクエストヘッダーとは  
HTTPヘッダーとは、HTTPプロトコルでクライアントとサーバーの間で送受信されるデータに付加される制御情報のことです。 

### HTTPステータスコードとは何か  
### 下記のHTTPステータスコードとは  
 ### 200  
 ### 201  
 ### 400  
 ### 404  
 ### 500  
### レスポンスヘッダーとは  
### レスポンスボディとは  
### JSONとは  
### JSONを使ってなにかのデータを表現してください  
### たとえば、ユーザー情報や商品情報など  
### Markdownの記法も勉強して使えるようにしましょう。  
### 見出し  
### 箇条書き  
### 太字  
### 引用  
### リンク  
### 画像の貼り付け  
### MarkdownはGitHubのREADME.mdだけでなくエンジニアがドキュメントを書くときによく使われます。  
