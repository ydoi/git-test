# linguist
*linguist-vendored　に指定されたパスはLanguage statisticsの割合から除かれる

*linguist-vendored=false に指定されたパスはLanguage statisticsの割合に含まれる

# protected branches
*マージに総評コメントによる制限をかけることができる。  
*プルリクエストの差分確認画面にある"Review Changed"から  
*Comment（LGTM）,Approve(承認),RequestChange(指摘あり)を選択して総評コメントができ、   
*Approveの総評が無いとWarningが表示されてマージ不可となる。  
*設定はSettings>Branches>Protected Branchesから設定したいマージ対象branchを選択し、  
*"Require pull request reviews before merging "にチェック  
<img src="https://github.com/ydoi/git-test/tree/master/image/protected_branch.png" >  
<img src="https://github.com/ydoi/git-test/tree/master/image/restrict_merge.png" >
