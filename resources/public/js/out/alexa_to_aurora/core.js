// Compiled by ClojureScript 0.0-2173
goog.provide('alexa_to_aurora.core');
goog.require('cljs.core');
goog.require('cljs.core.async');
goog.require('alexa_to_aurora.styles');
goog.require('alexa_to_aurora.styles');
goog.require('cljs_http.client');
goog.require('cljs_http.client');
goog.require('cljs.core.async');
goog.require('om.dom');
goog.require('om.dom');
goog.require('om.core');
goog.require('om.core');
cljs.core.enable_console_print_BANG_.call(null);
alexa_to_aurora.core.app_state = cljs.core.atom.call(null,cljs.core.PersistentArrayMap.EMPTY);
alexa_to_aurora.core.dump = (function dump(x){return console.log(x);
});
alexa_to_aurora.core.get_data = (function get_data(){var c__6192__auto__ = cljs.core.async.chan.call(null,1);cljs.core.async.impl.dispatch.run.call(null,(function (){var f__6193__auto__ = (function (){var switch__6177__auto__ = (function (state_9308){var state_val_9309 = (state_9308[1]);if((state_val_9309 === 2))
{var inst_9300 = (state_9308[2]);var inst_9301 = new cljs.core.Keyword(null,"status","status",4416389988).cljs$core$IFn$_invoke$arity$1(inst_9300);var inst_9305 = new cljs.core.Keyword(null,"body","body",1016933652).cljs$core$IFn$_invoke$arity$1(inst_9300);var inst_9306 = cljs.core.js__GT_clj.call(null,inst_9305);var state_9308__$1 = (function (){var statearr_9310 = state_9308;(statearr_9310[7] = inst_9301);
return statearr_9310;
})();return cljs.core.async.impl.ioc_helpers.return_chan.call(null,state_9308__$1,inst_9306);
} else
{if((state_val_9309 === 1))
{var inst_9298 = cljs_http.client.get.call(null,"/data");var state_9308__$1 = state_9308;return cljs.core.async.impl.ioc_helpers.take_BANG_.call(null,state_9308__$1,2,inst_9298);
} else
{return null;
}
}
});return ((function (switch__6177__auto__){
return (function() {
var state_machine__6178__auto__ = null;
var state_machine__6178__auto____0 = (function (){var statearr_9314 = [null,null,null,null,null,null,null,null];(statearr_9314[0] = state_machine__6178__auto__);
(statearr_9314[1] = 1);
return statearr_9314;
});
var state_machine__6178__auto____1 = (function (state_9308){while(true){
var ret_value__6179__auto__ = (function (){try{while(true){
var result__6180__auto__ = switch__6177__auto__.call(null,state_9308);if(cljs.core.keyword_identical_QMARK_.call(null,result__6180__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
continue;
}
} else
{return result__6180__auto__;
}
break;
}
}catch (e9315){if((e9315 instanceof Object))
{var ex__6181__auto__ = e9315;var statearr_9316_9318 = state_9308;(statearr_9316_9318[5] = ex__6181__auto__);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_9308);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if(new cljs.core.Keyword(null,"else","else",1017020587))
{throw e9315;
} else
{return null;
}
}
}})();if(cljs.core.keyword_identical_QMARK_.call(null,ret_value__6179__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
var G__9319 = state_9308;
state_9308 = G__9319;
continue;
}
} else
{return ret_value__6179__auto__;
}
break;
}
});
state_machine__6178__auto__ = function(state_9308){
switch(arguments.length){
case 0:
return state_machine__6178__auto____0.call(this);
case 1:
return state_machine__6178__auto____1.call(this,state_9308);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$0 = state_machine__6178__auto____0;
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$1 = state_machine__6178__auto____1;
return state_machine__6178__auto__;
})()
;})(switch__6177__auto__))
})();var state__6194__auto__ = (function (){var statearr_9317 = f__6193__auto__.call(null);(statearr_9317[cljs.core.async.impl.ioc_helpers.USER_START_IDX] = c__6192__auto__);
return statearr_9317;
})();return cljs.core.async.impl.ioc_helpers.run_state_machine_wrapped.call(null,state__6194__auto__);
}));
return c__6192__auto__;
});
alexa_to_aurora.core.post_data = (function post_data(app){var c__6192__auto__ = cljs.core.async.chan.call(null,1);cljs.core.async.impl.dispatch.run.call(null,(function (){var f__6193__auto__ = (function (){var switch__6177__auto__ = (function (state_9356){var state_val_9357 = (state_9356[1]);if((state_val_9357 === 2))
{var inst_9348 = (state_9356[2]);var inst_9349 = new cljs.core.Keyword(null,"status","status",4416389988).cljs$core$IFn$_invoke$arity$1(inst_9348);var inst_9353 = new cljs.core.Keyword(null,"body","body",1016933652).cljs$core$IFn$_invoke$arity$1(inst_9348);var inst_9354 = cljs.core.js__GT_clj.call(null,inst_9353);var state_9356__$1 = (function (){var statearr_9358 = state_9356;(statearr_9358[7] = inst_9349);
return statearr_9358;
})();return cljs.core.async.impl.ioc_helpers.return_chan.call(null,state_9356__$1,inst_9354);
} else
{if((state_val_9357 === 1))
{var inst_9343 = [new cljs.core.Keyword(null,"edn-params","edn-params",1007197398)];var inst_9344 = [app];var inst_9345 = cljs.core.PersistentHashMap.fromArrays.call(null,inst_9343,inst_9344);var inst_9346 = cljs_http.client.post.call(null,"/run",inst_9345);var state_9356__$1 = state_9356;return cljs.core.async.impl.ioc_helpers.take_BANG_.call(null,state_9356__$1,2,inst_9346);
} else
{return null;
}
}
});return ((function (switch__6177__auto__){
return (function() {
var state_machine__6178__auto__ = null;
var state_machine__6178__auto____0 = (function (){var statearr_9362 = [null,null,null,null,null,null,null,null];(statearr_9362[0] = state_machine__6178__auto__);
(statearr_9362[1] = 1);
return statearr_9362;
});
var state_machine__6178__auto____1 = (function (state_9356){while(true){
var ret_value__6179__auto__ = (function (){try{while(true){
var result__6180__auto__ = switch__6177__auto__.call(null,state_9356);if(cljs.core.keyword_identical_QMARK_.call(null,result__6180__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
continue;
}
} else
{return result__6180__auto__;
}
break;
}
}catch (e9363){if((e9363 instanceof Object))
{var ex__6181__auto__ = e9363;var statearr_9364_9366 = state_9356;(statearr_9364_9366[5] = ex__6181__auto__);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_9356);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if(new cljs.core.Keyword(null,"else","else",1017020587))
{throw e9363;
} else
{return null;
}
}
}})();if(cljs.core.keyword_identical_QMARK_.call(null,ret_value__6179__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
var G__9367 = state_9356;
state_9356 = G__9367;
continue;
}
} else
{return ret_value__6179__auto__;
}
break;
}
});
state_machine__6178__auto__ = function(state_9356){
switch(arguments.length){
case 0:
return state_machine__6178__auto____0.call(this);
case 1:
return state_machine__6178__auto____1.call(this,state_9356);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$0 = state_machine__6178__auto____0;
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$1 = state_machine__6178__auto____1;
return state_machine__6178__auto__;
})()
;})(switch__6177__auto__))
})();var state__6194__auto__ = (function (){var statearr_9365 = f__6193__auto__.call(null);(statearr_9365[cljs.core.async.impl.ioc_helpers.USER_START_IDX] = c__6192__auto__);
return statearr_9365;
})();return cljs.core.async.impl.ioc_helpers.run_state_machine_wrapped.call(null,state__6194__auto__);
}));
return c__6192__auto__;
});
alexa_to_aurora.core.handle_change = (function handle_change(app,edit_key,e){return om.core.transact_BANG_.call(null,app,edit_key,(function (_){return e.target.value;
}));
});
alexa_to_aurora.core.prompt_text = (function prompt_text(app,p__9369){var vec__9371 = p__9369;var p = cljs.core.nth.call(null,vec__9371,0,null);var v = cljs.core.nth.call(null,vec__9371,1,null);return React.DOM.tr({"style": alexa_to_aurora.styles.survey_item.call(null)},React.DOM.td(alexa_to_aurora.styles.prompt.call(null),cljs.core.name.call(null,p)),React.DOM.td(null,om.dom.input.call(null,alexa_to_aurora.styles.merge_js.call(null,alexa_to_aurora.styles.text_field.call(null,p,v),{"onChange": (function (p1__9368_SHARP_){return alexa_to_aurora.core.handle_change.call(null,app,p,p1__9368_SHARP_);
})}))));
});
alexa_to_aurora.core.controls_view = (function controls_view(app,owner){if(typeof alexa_to_aurora.core.t9389 !== 'undefined')
{} else
{
/**
* @constructor
*/
alexa_to_aurora.core.t9389 = (function (owner,app,controls_view,meta9390){
this.owner = owner;
this.app = app;
this.controls_view = controls_view;
this.meta9390 = meta9390;
this.cljs$lang$protocol_mask$partition1$ = 0;
this.cljs$lang$protocol_mask$partition0$ = 393216;
})
alexa_to_aurora.core.t9389.cljs$lang$type = true;
alexa_to_aurora.core.t9389.cljs$lang$ctorStr = "alexa-to-aurora.core/t9389";
alexa_to_aurora.core.t9389.cljs$lang$ctorPrWriter = (function (this__4010__auto__,writer__4011__auto__,opt__4012__auto__){return cljs.core._write.call(null,writer__4011__auto__,"alexa-to-aurora.core/t9389");
});
alexa_to_aurora.core.t9389.prototype.om$core$IRender$ = true;
alexa_to_aurora.core.t9389.prototype.om$core$IRender$render$arity$1 = (function (_){var self__ = this;
var ___$1 = this;return React.DOM.div({"id": "controls"},React.DOM.h1({"style": {"color": "SteelBlue", "font-family": "Tahoma"}},"Copy Alexa SQL DB to Aurora Datomic DB"),React.DOM.h2({"style": {"color": "SteelBlue", "font-family": "Tahoma"}},"Parameters"),cljs.core.apply.call(null,om.dom.table,null,cljs.core.map.call(null,cljs.core.partial.call(null,alexa_to_aurora.core.prompt_text,self__.app),self__.app)),React.DOM.button({"onClick": (function (){return alexa_to_aurora.core.post_data.call(null,cljs.core.deref.call(null,self__.app));
}), "style": {"margin": "20px 0px 0px 0px", "width": "85", "color": "Red"}},"Run"));
});
alexa_to_aurora.core.t9389.prototype.om$core$IWillMount$ = true;
alexa_to_aurora.core.t9389.prototype.om$core$IWillMount$will_mount$arity$1 = (function (_){var self__ = this;
var ___$1 = this;var c__6192__auto__ = cljs.core.async.chan.call(null,1);cljs.core.async.impl.dispatch.run.call(null,(function (){var f__6193__auto__ = (function (){var switch__6177__auto__ = (function (state_9397){var state_val_9398 = (state_9397[1]);if((state_val_9398 === 2))
{var inst_9394 = (state_9397[2]);var inst_9395 = om.core.update_BANG_.call(null,self__.app,inst_9394);var state_9397__$1 = state_9397;return cljs.core.async.impl.ioc_helpers.return_chan.call(null,state_9397__$1,inst_9395);
} else
{if((state_val_9398 === 1))
{var inst_9392 = alexa_to_aurora.core.get_data.call(null);var state_9397__$1 = state_9397;return cljs.core.async.impl.ioc_helpers.take_BANG_.call(null,state_9397__$1,2,inst_9392);
} else
{return null;
}
}
});return ((function (switch__6177__auto__){
return (function() {
var state_machine__6178__auto__ = null;
var state_machine__6178__auto____0 = (function (){var statearr_9402 = [null,null,null,null,null,null,null];(statearr_9402[0] = state_machine__6178__auto__);
(statearr_9402[1] = 1);
return statearr_9402;
});
var state_machine__6178__auto____1 = (function (state_9397){while(true){
var ret_value__6179__auto__ = (function (){try{while(true){
var result__6180__auto__ = switch__6177__auto__.call(null,state_9397);if(cljs.core.keyword_identical_QMARK_.call(null,result__6180__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
continue;
}
} else
{return result__6180__auto__;
}
break;
}
}catch (e9403){if((e9403 instanceof Object))
{var ex__6181__auto__ = e9403;var statearr_9404_9406 = state_9397;(statearr_9404_9406[5] = ex__6181__auto__);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_9397);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if(new cljs.core.Keyword(null,"else","else",1017020587))
{throw e9403;
} else
{return null;
}
}
}})();if(cljs.core.keyword_identical_QMARK_.call(null,ret_value__6179__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
var G__9407 = state_9397;
state_9397 = G__9407;
continue;
}
} else
{return ret_value__6179__auto__;
}
break;
}
});
state_machine__6178__auto__ = function(state_9397){
switch(arguments.length){
case 0:
return state_machine__6178__auto____0.call(this);
case 1:
return state_machine__6178__auto____1.call(this,state_9397);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$0 = state_machine__6178__auto____0;
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$1 = state_machine__6178__auto____1;
return state_machine__6178__auto__;
})()
;})(switch__6177__auto__))
})();var state__6194__auto__ = (function (){var statearr_9405 = f__6193__auto__.call(null);(statearr_9405[cljs.core.async.impl.ioc_helpers.USER_START_IDX] = c__6192__auto__);
return statearr_9405;
})();return cljs.core.async.impl.ioc_helpers.run_state_machine_wrapped.call(null,state__6194__auto__);
}));
return c__6192__auto__;
});
alexa_to_aurora.core.t9389.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_9391){var self__ = this;
var _9391__$1 = this;return self__.meta9390;
});
alexa_to_aurora.core.t9389.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_9391,meta9390__$1){var self__ = this;
var _9391__$1 = this;return (new alexa_to_aurora.core.t9389(self__.owner,self__.app,self__.controls_view,meta9390__$1));
});
alexa_to_aurora.core.__GT_t9389 = (function __GT_t9389(owner__$1,app__$1,controls_view__$1,meta9390){return (new alexa_to_aurora.core.t9389(owner__$1,app__$1,controls_view__$1,meta9390));
});
}
return (new alexa_to_aurora.core.t9389(owner,app,controls_view,null));
});
om.core.root.call(null,alexa_to_aurora.core.controls_view,alexa_to_aurora.core.app_state,new cljs.core.PersistentArrayMap(null, 1, [new cljs.core.Keyword(null,"target","target",4427965699),document.getElementById("controls")], null));

//# sourceMappingURL=core.js.map