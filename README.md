# linguist
*linguist-vendored　に指定されたパスはLanguage statisticsの割合から除かれる

*linguist-vendored=false に指定されたパスはLanguage statisticsの割合に含まれる

# protected branches
*マージに総評コメントによる制限をかけることができる。  
*プルリクエストの差分確認画面にある"Review Changed"から  
*Comment（LGTM）,Approve(承認),RequestChange(指摘あり)を選択して総評コメントができ、   
*Approveの総評が無いとWarningが表示されてマージ不可となる。  
*Openのリポジトリの場合はCollaborators権限のあるアカウントでないとコメントをしてもマージ可とならないので注意。
<img src=https://user-images.githubusercontent.com/10039786/27944119-8fc71014-631f-11e7-8ea7-39dd6ef70f9f.png width=400px>
<img src=https://user-images.githubusercontent.com/10039786/27944171-106b087e-6320-11e7-9016-d8e1be0bc150.png width=400px>  
<img src=https://user-images.githubusercontent.com/10039786/27943894-c6bc5f86-631d-11e7-8920-ceae70ac7ac6.png width=400px>  
*設定はSettings>Branches>Protected Branchesからマージ対象branchを選択し、  
*"Require pull request reviews before merging "にチェック  
<img src=https://user-images.githubusercontent.com/10039786/27943893-c5daa690-631d-11e7-95fa-44f6a20459d3.png width=400px>  
