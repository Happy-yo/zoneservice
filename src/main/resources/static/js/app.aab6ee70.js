(function(t){function e(e){for(var a,s,r=e[0],l=e[1],c=e[2],d=0,f=[];d<r.length;d++)s=r[d],Object.prototype.hasOwnProperty.call(o,s)&&o[s]&&f.push(o[s][0]),o[s]=0;for(a in l)Object.prototype.hasOwnProperty.call(l,a)&&(t[a]=l[a]);u&&u(e);while(f.length)f.shift()();return i.push.apply(i,c||[]),n()}function n(){for(var t,e=0;e<i.length;e++){for(var n=i[e],a=!0,r=1;r<n.length;r++){var l=n[r];0!==o[l]&&(a=!1)}a&&(i.splice(e--,1),t=s(s.s=n[0]))}return t}var a={},o={app:0},i=[];function s(e){if(a[e])return a[e].exports;var n=a[e]={i:e,l:!1,exports:{}};return t[e].call(n.exports,n,n.exports,s),n.l=!0,n.exports}s.m=t,s.c=a,s.d=function(t,e,n){s.o(t,e)||Object.defineProperty(t,e,{enumerable:!0,get:n})},s.r=function(t){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})},s.t=function(t,e){if(1&e&&(t=s(t)),8&e)return t;if(4&e&&"object"===typeof t&&t&&t.__esModule)return t;var n=Object.create(null);if(s.r(n),Object.defineProperty(n,"default",{enumerable:!0,value:t}),2&e&&"string"!=typeof t)for(var a in t)s.d(n,a,function(e){return t[e]}.bind(null,a));return n},s.n=function(t){var e=t&&t.__esModule?function(){return t["default"]}:function(){return t};return s.d(e,"a",e),e},s.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},s.p="/";var r=window["webpackJsonp"]=window["webpackJsonp"]||[],l=r.push.bind(r);r.push=e,r=r.slice();for(var c=0;c<r.length;c++)e(r[c]);var u=l;i.push([0,"chunk-vendors"]),n()})({0:function(t,e,n){t.exports=n("56d7")},"034f":function(t,e,n){"use strict";n("85ec")},"0611":function(t,e,n){"use strict";n("c38b")},"379b":function(t,e,n){},5023:function(t,e,n){"use strict";n("e07c")},"53b1":function(t,e,n){"use strict";n("379b")},"56d7":function(t,e,n){"use strict";n.r(e);n("e260"),n("e6cf"),n("cca6"),n("a79d");var a=n("2b0e"),o=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{attrs:{id:"app"}},[t.sign?n("index"):n("login",{on:{setSign:t.setSign}})],1)},i=[],s=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("el-form",{ref:"form",staticClass:"form",attrs:{model:t.form,"label-width":"60px"}},[n("h3",[t._v("管理系统登陆")]),n("el-form-item",{attrs:{label:"账号"}},[n("el-input",{model:{value:t.form.userid,callback:function(e){t.$set(t.form,"userid",e)},expression:"form.userid"}})],1),n("el-form-item",{attrs:{label:"密码"}},[n("el-input",{attrs:{type:"password","show-password":""},model:{value:t.form.password,callback:function(e){t.$set(t.form,"password",e)},expression:"form.password"}})],1),n("el-button",{attrs:{type:"primary"},on:{click:t.onSubmit}},[t._v("登陆")])],1)},r=[],l={name:"",data:function(){return{form:{userid:"",password:""}}},methods:{onSubmit:function(){var t=this,e={userid:this.form.userid,password:this.form.password};this.$axios({url:"http://www.jokerwen.top/zone/action/v1/login",method:"post",data:e}).then((function(n){var a=n.data;"F"!=a.RESULT?0!=a.admin?"T"==a.RESULT&&1==a.admin&&(t.$message.success(a.MESSAGE),t.login(e)):t.$message.error("非管理员登陆"):t.$message.error(a.Message)}))},login:function(t){this.$admin.form=t,console.log("admin",this.$admin),this.$emit("setSign")}},created:function(){}},c=l,u=(n("df31"),n("2877")),d=Object(u["a"])(c,s,r,!1,null,"9eb8d172",null),f=d.exports,m=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"index"},[n("menus",{on:{setIndex:t.setIndex}}),n("div",{staticClass:"content"},[n("div",{staticClass:"time"},[n("div",[t._v("管理员")]),n("div",[t._v(t._s(t.time))])]),n("hr"),1==t.index?n("div",[t._v("首页")]):t._e(),2==t.index?n("share",{staticClass:"share"}):t._e(),3==t.index?n("usermanage"):t._e()],1)],1)},h=[],p=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("el-menu",{staticClass:"el-menu-vertical-demo menu",attrs:{"default-active":"2","background-color":"#545c64","text-color":"#fff","active-text-color":"#ffd04b"}},[n("el-menu-item",{attrs:{index:"1"},on:{click:function(e){return t.setIndex(1)}}},[n("template",{slot:"title"},[n("i",{staticClass:"el-icon-location"}),n("span",[t._v("首页")])])],2),n("el-menu-item",{attrs:{index:"2"},on:{click:function(e){return t.setIndex(2)}}},[n("template",{slot:"title"},[n("i",{staticClass:"el-icon-share"}),n("span",{attrs:{slot:"title"},slot:"title"},[t._v("分享管理")])])],2),n("el-menu-item",{attrs:{index:"3"},on:{click:function(e){return t.setIndex(3)}}},[n("template",{slot:"title"},[n("i",{staticClass:"el-icon-menu"})]),n("span",{attrs:{slot:"title"},slot:"title"},[t._v("用户管理")])],2)],1)},w=[],b={name:"menus",data:function(){return{}},methods:{setIndex:function(t){this.$emit("setIndex",t)}}},g=b,v=(n("5ede"),Object(u["a"])(g,p,w,!1,null,"35d47b8b",null)),x=v.exports,_=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",[n("el-table",{staticStyle:{width:"100%"},attrs:{data:t.shares,"max-height":"800",stripe:"",border:""}},[n("el-table-column",{attrs:{prop:"id",label:"id",width:"50",fixed:""}}),n("el-table-column",{attrs:{prop:"title",label:"标题",width:"150"}}),n("el-table-column",{attrs:{prop:"image",label:"缩略图"},scopedSlots:t._u([{key:"default",fn:function(t){return[n("img",{staticClass:"img",attrs:{src:t.row.image}})]}}])}),n("el-table-column",{attrs:{prop:"author",label:"作者id",width:"100"}}),n("el-table-column",{attrs:{prop:"checkon",label:"审核状态",width:"100"},scopedSlots:t._u([{key:"default",fn:function(e){return[0==e.row.checkon?n("el-tag",[t._v("未审核")]):1==e.row.checkon?n("el-tag",{attrs:{type:"success"}},[t._v("通过")]):2==e.row.checkon?n("el-tag",{attrs:{type:"info"}},[t._v("未通过")]):t._e()]}}])}),n("el-table-column",{attrs:{prop:"checkon",label:"操作",width:"150"},scopedSlots:t._u([{key:"default",fn:function(e){return[n("el-dropdown",{attrs:{"hide-on-click":!1},on:{command:t.checkshare}},[n("span",{staticClass:"el-dropdown-link"},[t._v(" 操作项"),n("i",{staticClass:"el-icon-arrow-down el-icon--right"})]),n("el-dropdown-menu",{attrs:{slot:"dropdown"},slot:"dropdown"},[n("el-dropdown-item",{attrs:{disabled:0!=e.row.checkon,command:[e.row,1]}},[t._v("审核通过 ")]),n("el-dropdown-item",{attrs:{disabled:0!=e.row.checkon,command:[e.row,2]}},[t._v("审核不通过 ")]),n("el-dropdown-item",{attrs:{divided:""}}),n("el-dropdown-item",{attrs:{command:[e,3]}},[t._v("删除该分享")])],1)],1)]}}])})],1)],1)},$=[],k=(n("a434"),{name:"share",data:function(){return{shares:[]}},methods:{getall:function(){var t=this;this.$axios({url:"http://www.jokerwen.top/zone/action/v2/getallshare",method:"post",data:this.$admin.form}).then((function(e){var n=e.data;"T"==n.RESULT&&(t.shares=n.ROWS_DETAIL)}))},checkshare:function(t){var e=this;1==t[1]||2==t[1]?this.$axios({url:"http://www.jokerwen.top/zone/action/v2/checkshare",method:"post",data:{id:t[0].id,checkon:t[1],userid:this.$admin.form.userid}}).then((function(e){var n=e.data;"T"==n.RESULT&&(t[0].checkon=t[1])})):3==t[1]&&this.$axios({url:"http://www.jokerwen.top/zone/action/v2/deleteshare",method:"post",data:{id:t[0].row.id,author:t[0].row.author}}).then((function(n){var a=n.data;"T"==a.RESULT&&e.shares.splice(t[0].$index,1),e.$message.info(a.MESSAGE)}))}},created:function(){this.getall()}}),S=k,y=(n("5023"),Object(u["a"])(S,_,$,!1,null,"62e95885",null)),E=y.exports,D=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"users"},[n("el-table",{staticStyle:{width:"100%"},attrs:{data:t.users,"max-height":"800",stripe:"",border:""}},[n("el-table-column",{attrs:{prop:"userid",label:"用户id",width:"100",fixed:""}}),n("el-table-column",{attrs:{prop:"username",label:"用户名",width:"200"}}),n("el-table-column",{attrs:{prop:"password",label:"密码",width:"150"}}),n("el-table-column",{attrs:{label:"管理员",width:"200"},scopedSlots:t._u([{key:"default",fn:function(e){return[1==e.row.admins?n("el-tag",{attrs:{type:"success"}},[t._v("管理员")]):0==e.row.admins?n("el-tag",{attrs:{type:"info"}},[t._v("普通用户")]):t._e()]}}])}),n("el-table-column",{attrs:{prop:"",label:"操作",width:"200"},scopedSlots:t._u([{key:"default",fn:function(e){return[n("div",{staticStyle:{display:"flex"}},[n("el-button",{attrs:{size:"mini"},on:{click:function(n){return t.change(e)}}},[t._v("修改")]),n("el-button",{attrs:{size:"mini",type:"danger"},on:{click:function(n){return t.del(e)}}},[t._v("删除")])],1)]}}])})],1),n("el-dialog",{attrs:{title:"修改",visible:t.dialogVisible,width:"50%","before-close":t.handleClose},on:{"update:visible":function(e){t.dialogVisible=e}}},[n("el-form",{ref:"form",staticClass:"form",attrs:{model:t.changeData,"label-width":"60px"}},[n("el-form-item",{attrs:{label:"用户名"}},[n("el-input",{model:{value:t.changeData.username,callback:function(e){t.$set(t.changeData,"username",e)},expression:"changeData.username"}})],1),n("el-form-item",{attrs:{label:"密码"}},[n("el-input",{model:{value:t.changeData.password,callback:function(e){t.$set(t.changeData,"password",e)},expression:"changeData.password"}})],1),n("el-form-item",{attrs:{label:"权限"}},[n("el-radio",{attrs:{label:1},model:{value:t.changeData.admins,callback:function(e){t.$set(t.changeData,"admins",e)},expression:"changeData.admins"}},[t._v("管理员")]),n("el-radio",{attrs:{label:0},model:{value:t.changeData.admins,callback:function(e){t.$set(t.changeData,"admins",e)},expression:"changeData.admins"}},[t._v("普通用户")])],1)],1),n("el-button",{attrs:{type:"primary"},on:{click:function(e){return t.save(t.index)}}},[t._v("保存")])],1)],1)},j=[],O={name:"",components:{},props:{},data:function(){return{users:[],dialogVisible:!1,index:null,changeData:{}}},computed:{},methods:{getall:function(){var t=this;this.$axios({url:"http://www.jokerwen.top/zone/action/v1/getalluser",method:"post",data:this.$admin.form}).then((function(e){var n=e.data;"T"==n.RESULT&&(t.users=n.ROWS_DETAIL)}))},change:function(t){this.index=t.$index,this.dialogVisible=!0,this.changeData=JSON.parse(JSON.stringify(t.row))},save:function(t){var e=this;this.$admin.form.userid!=this.changeData.userid||1==this.changeData.admins?this.$axios({url:"http://www.jokerwen.top/zone/action/v1/alteruser",method:"post",data:this.changeData}).then((function(n){var a=n.data;"T"==a.RESULT&&(e.$set(e.users,t,e.changeData),e.dialogVisible=!1),e.$message.info(a.MESSAGE)})):this.$message.warning("不能更改自己的管理员权限")},del:function(t){var e=this;this.$admin.form.userid!=t.row.userid?this.$axios({url:"http://www.jokerwen.top/zone/action/v1/deleteuser",method:"post",data:{userid:t.row.userid}}).then((function(n){var a=n.data;"T"==a.RESULT&&e.users.splice(t.$index,1),e.$message.info(a.MESSAGE)})):this.$message.warning("不能删除自己")},handleClose:function(t){this.$confirm("确认关闭？").then((function(){t()})).catch((function(){}))}},created:function(){this.getall()}},T=O,C=(n("0611"),Object(u["a"])(T,D,j,!1,null,"768083e6",null)),L=C.exports,I={name:"",components:{menus:x,share:E,usermanage:L},data:function(){return{index:3,time:(new Date).toLocaleString()}},methods:{setIndex:function(t){this.index=t},newtime:function(){this.time=(new Date).toLocaleString()}},created:function(){setInterval(this.newtime,1e3)}},R=I,z=(n("53b1"),Object(u["a"])(R,m,h,!1,null,"fe2b1d7e",null)),M=z.exports,U={name:"App",components:{login:f,index:M},data:function(){return{sign:!1}},methods:{setSign:function(){console.log("logined"),this.sign=!0}}},A=U,P=(n("034f"),Object(u["a"])(A,o,i,!1,null,null,null)),V=P.exports,G=n("bc3a"),J=n.n(G),N=n("5c96"),W=n.n(N);n("0fae");a["default"].prototype.$admin={},a["default"].prototype.$axios=J.a,a["default"].config.productionTip=!1,a["default"].use(W.a),new a["default"]({render:function(t){return t(V)}}).$mount("#app")},"5ede":function(t,e,n){"use strict";n("8e39")},"85ec":function(t,e,n){},"8e39":function(t,e,n){},c38b:function(t,e,n){},df31:function(t,e,n){"use strict";n("ec09")},e07c:function(t,e,n){},ec09:function(t,e,n){}});
//# sourceMappingURL=app.aab6ee70.js.map