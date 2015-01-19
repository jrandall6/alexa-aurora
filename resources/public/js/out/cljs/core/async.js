// Compiled by ClojureScript 0.0-2173
goog.provide('cljs.core.async');
goog.require('cljs.core');
goog.require('cljs.core.async.impl.ioc_helpers');
goog.require('cljs.core.async.impl.protocols');
goog.require('cljs.core.async.impl.buffers');
goog.require('cljs.core.async.impl.timers');
goog.require('cljs.core.async.impl.channels');
goog.require('cljs.core.async.impl.dispatch');
goog.require('cljs.core.async.impl.dispatch');
goog.require('cljs.core.async.impl.buffers');
goog.require('cljs.core.async.impl.protocols');
goog.require('cljs.core.async.impl.timers');
goog.require('cljs.core.async.impl.channels');
goog.require('cljs.core.async.impl.ioc_helpers');
cljs.core.async.fn_handler = (function fn_handler(f){if(typeof cljs.core.async.t10975 !== 'undefined')
{} else
{
/**
* @constructor
*/
cljs.core.async.t10975 = (function (f,fn_handler,meta10976){
this.f = f;
this.fn_handler = fn_handler;
this.meta10976 = meta10976;
this.cljs$lang$protocol_mask$partition1$ = 0;
this.cljs$lang$protocol_mask$partition0$ = 393216;
})
cljs.core.async.t10975.cljs$lang$type = true;
cljs.core.async.t10975.cljs$lang$ctorStr = "cljs.core.async/t10975";
cljs.core.async.t10975.cljs$lang$ctorPrWriter = (function (this__4010__auto__,writer__4011__auto__,opt__4012__auto__){return cljs.core._write.call(null,writer__4011__auto__,"cljs.core.async/t10975");
});
cljs.core.async.t10975.prototype.cljs$core$async$impl$protocols$Handler$ = true;
cljs.core.async.t10975.prototype.cljs$core$async$impl$protocols$Handler$active_QMARK_$arity$1 = (function (_){var self__ = this;
var ___$1 = this;return true;
});
cljs.core.async.t10975.prototype.cljs$core$async$impl$protocols$Handler$commit$arity$1 = (function (_){var self__ = this;
var ___$1 = this;return self__.f;
});
cljs.core.async.t10975.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_10977){var self__ = this;
var _10977__$1 = this;return self__.meta10976;
});
cljs.core.async.t10975.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_10977,meta10976__$1){var self__ = this;
var _10977__$1 = this;return (new cljs.core.async.t10975(self__.f,self__.fn_handler,meta10976__$1));
});
cljs.core.async.__GT_t10975 = (function __GT_t10975(f__$1,fn_handler__$1,meta10976){return (new cljs.core.async.t10975(f__$1,fn_handler__$1,meta10976));
});
}
return (new cljs.core.async.t10975(f,fn_handler,null));
});
/**
* Returns a fixed buffer of size n. When full, puts will block/park.
*/
cljs.core.async.buffer = (function buffer(n){return cljs.core.async.impl.buffers.fixed_buffer.call(null,n);
});
/**
* Returns a buffer of size n. When full, puts will complete but
* val will be dropped (no transfer).
*/
cljs.core.async.dropping_buffer = (function dropping_buffer(n){return cljs.core.async.impl.buffers.dropping_buffer.call(null,n);
});
/**
* Returns a buffer of size n. When full, puts will complete, and be
* buffered, but oldest elements in buffer will be dropped (not
* transferred).
*/
cljs.core.async.sliding_buffer = (function sliding_buffer(n){return cljs.core.async.impl.buffers.sliding_buffer.call(null,n);
});
/**
* Returns true if a channel created with buff will never block. That is to say,
* puts into this buffer will never cause the buffer to be full.
*/
cljs.core.async.unblocking_buffer_QMARK_ = (function unblocking_buffer_QMARK_(buff){var G__10979 = buff;if(G__10979)
{var bit__4093__auto__ = null;if(cljs.core.truth_((function (){var or__3443__auto__ = bit__4093__auto__;if(cljs.core.truth_(or__3443__auto__))
{return or__3443__auto__;
} else
{return G__10979.cljs$core$async$impl$protocols$UnblockingBuffer$;
}
})()))
{return true;
} else
{if((!G__10979.cljs$lang$protocol_mask$partition$))
{return cljs.core.native_satisfies_QMARK_.call(null,cljs.core.async.impl.protocols.UnblockingBuffer,G__10979);
} else
{return false;
}
}
} else
{return cljs.core.native_satisfies_QMARK_.call(null,cljs.core.async.impl.protocols.UnblockingBuffer,G__10979);
}
});
/**
* Creates a channel with an optional buffer. If buf-or-n is a number,
* will create and use a fixed buffer of that size.
*/
cljs.core.async.chan = (function() {
var chan = null;
var chan__0 = (function (){return chan.call(null,null);
});
var chan__1 = (function (buf_or_n){var buf_or_n__$1 = ((cljs.core._EQ_.call(null,buf_or_n,0))?null:buf_or_n);return cljs.core.async.impl.channels.chan.call(null,((typeof buf_or_n__$1 === 'number')?cljs.core.async.buffer.call(null,buf_or_n__$1):buf_or_n__$1));
});
chan = function(buf_or_n){
switch(arguments.length){
case 0:
return chan__0.call(this);
case 1:
return chan__1.call(this,buf_or_n);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
chan.cljs$core$IFn$_invoke$arity$0 = chan__0;
chan.cljs$core$IFn$_invoke$arity$1 = chan__1;
return chan;
})()
;
/**
* Returns a channel that will close after msecs
*/
cljs.core.async.timeout = (function timeout(msecs){return cljs.core.async.impl.timers.timeout.call(null,msecs);
});
/**
* takes a val from port. Must be called inside a (go ...) block. Will
* return nil if closed. Will park if nothing is available.
*/
cljs.core.async._LT__BANG_ = (function _LT__BANG_(port){if(null)
{return null;
} else
{throw (new Error([cljs.core.str("Assert failed: "),cljs.core.str("<! used not in (go ...) block"),cljs.core.str("\n"),cljs.core.str(cljs.core.pr_str.call(null,null))].join('')));
}
});
/**
* Asynchronously takes a val from port, passing to fn1. Will pass nil
* if closed. If on-caller? (default true) is true, and value is
* immediately available, will call fn1 on calling thread.
* Returns nil.
*/
cljs.core.async.take_BANG_ = (function() {
var take_BANG_ = null;
var take_BANG___2 = (function (port,fn1){return take_BANG_.call(null,port,fn1,true);
});
var take_BANG___3 = (function (port,fn1,on_caller_QMARK_){var ret = cljs.core.async.impl.protocols.take_BANG_.call(null,port,cljs.core.async.fn_handler.call(null,fn1));if(cljs.core.truth_(ret))
{var val_10980 = cljs.core.deref.call(null,ret);if(cljs.core.truth_(on_caller_QMARK_))
{fn1.call(null,val_10980);
} else
{cljs.core.async.impl.dispatch.run.call(null,(function (){return fn1.call(null,val_10980);
}));
}
} else
{}
return null;
});
take_BANG_ = function(port,fn1,on_caller_QMARK_){
switch(arguments.length){
case 2:
return take_BANG___2.call(this,port,fn1);
case 3:
return take_BANG___3.call(this,port,fn1,on_caller_QMARK_);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
take_BANG_.cljs$core$IFn$_invoke$arity$2 = take_BANG___2;
take_BANG_.cljs$core$IFn$_invoke$arity$3 = take_BANG___3;
return take_BANG_;
})()
;
cljs.core.async.nop = (function nop(){return null;
});
/**
* puts a val into port. nil values are not allowed. Must be called
* inside a (go ...) block. Will park if no buffer space is available.
*/
cljs.core.async._GT__BANG_ = (function _GT__BANG_(port,val){if(null)
{return null;
} else
{throw (new Error([cljs.core.str("Assert failed: "),cljs.core.str(">! used not in (go ...) block"),cljs.core.str("\n"),cljs.core.str(cljs.core.pr_str.call(null,null))].join('')));
}
});
/**
* Asynchronously puts a val into port, calling fn0 (if supplied) when
* complete. nil values are not allowed. Will throw if closed. If
* on-caller? (default true) is true, and the put is immediately
* accepted, will call fn0 on calling thread.  Returns nil.
*/
cljs.core.async.put_BANG_ = (function() {
var put_BANG_ = null;
var put_BANG___2 = (function (port,val){return put_BANG_.call(null,port,val,cljs.core.async.nop);
});
var put_BANG___3 = (function (port,val,fn0){return put_BANG_.call(null,port,val,fn0,true);
});
var put_BANG___4 = (function (port,val,fn0,on_caller_QMARK_){var ret = cljs.core.async.impl.protocols.put_BANG_.call(null,port,val,cljs.core.async.fn_handler.call(null,fn0));if(cljs.core.truth_((function (){var and__3431__auto__ = ret;if(cljs.core.truth_(and__3431__auto__))
{return cljs.core.not_EQ_.call(null,fn0,cljs.core.async.nop);
} else
{return and__3431__auto__;
}
})()))
{if(cljs.core.truth_(on_caller_QMARK_))
{fn0.call(null);
} else
{cljs.core.async.impl.dispatch.run.call(null,fn0);
}
} else
{}
return null;
});
put_BANG_ = function(port,val,fn0,on_caller_QMARK_){
switch(arguments.length){
case 2:
return put_BANG___2.call(this,port,val);
case 3:
return put_BANG___3.call(this,port,val,fn0);
case 4:
return put_BANG___4.call(this,port,val,fn0,on_caller_QMARK_);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
put_BANG_.cljs$core$IFn$_invoke$arity$2 = put_BANG___2;
put_BANG_.cljs$core$IFn$_invoke$arity$3 = put_BANG___3;
put_BANG_.cljs$core$IFn$_invoke$arity$4 = put_BANG___4;
return put_BANG_;
})()
;
cljs.core.async.close_BANG_ = (function close_BANG_(port){return cljs.core.async.impl.protocols.close_BANG_.call(null,port);
});
cljs.core.async.random_array = (function random_array(n){var a = (new Array(n));var n__4291__auto___10981 = n;var x_10982 = 0;while(true){
if((x_10982 < n__4291__auto___10981))
{(a[x_10982] = 0);
{
var G__10983 = (x_10982 + 1);
x_10982 = G__10983;
continue;
}
} else
{}
break;
}
var i = 1;while(true){
if(cljs.core._EQ_.call(null,i,n))
{return a;
} else
{var j = cljs.core.rand_int.call(null,i);(a[i] = (a[j]));
(a[j] = i);
{
var G__10984 = (i + 1);
i = G__10984;
continue;
}
}
break;
}
});
cljs.core.async.alt_flag = (function alt_flag(){var flag = cljs.core.atom.call(null,true);if(typeof cljs.core.async.t10988 !== 'undefined')
{} else
{
/**
* @constructor
*/
cljs.core.async.t10988 = (function (flag,alt_flag,meta10989){
this.flag = flag;
this.alt_flag = alt_flag;
this.meta10989 = meta10989;
this.cljs$lang$protocol_mask$partition1$ = 0;
this.cljs$lang$protocol_mask$partition0$ = 393216;
})
cljs.core.async.t10988.cljs$lang$type = true;
cljs.core.async.t10988.cljs$lang$ctorStr = "cljs.core.async/t10988";
cljs.core.async.t10988.cljs$lang$ctorPrWriter = (function (this__4010__auto__,writer__4011__auto__,opt__4012__auto__){return cljs.core._write.call(null,writer__4011__auto__,"cljs.core.async/t10988");
});
cljs.core.async.t10988.prototype.cljs$core$async$impl$protocols$Handler$ = true;
cljs.core.async.t10988.prototype.cljs$core$async$impl$protocols$Handler$active_QMARK_$arity$1 = (function (_){var self__ = this;
var ___$1 = this;return cljs.core.deref.call(null,self__.flag);
});
cljs.core.async.t10988.prototype.cljs$core$async$impl$protocols$Handler$commit$arity$1 = (function (_){var self__ = this;
var ___$1 = this;cljs.core.reset_BANG_.call(null,self__.flag,null);
return true;
});
cljs.core.async.t10988.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_10990){var self__ = this;
var _10990__$1 = this;return self__.meta10989;
});
cljs.core.async.t10988.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_10990,meta10989__$1){var self__ = this;
var _10990__$1 = this;return (new cljs.core.async.t10988(self__.flag,self__.alt_flag,meta10989__$1));
});
cljs.core.async.__GT_t10988 = (function __GT_t10988(flag__$1,alt_flag__$1,meta10989){return (new cljs.core.async.t10988(flag__$1,alt_flag__$1,meta10989));
});
}
return (new cljs.core.async.t10988(flag,alt_flag,null));
});
cljs.core.async.alt_handler = (function alt_handler(flag,cb){if(typeof cljs.core.async.t10994 !== 'undefined')
{} else
{
/**
* @constructor
*/
cljs.core.async.t10994 = (function (cb,flag,alt_handler,meta10995){
this.cb = cb;
this.flag = flag;
this.alt_handler = alt_handler;
this.meta10995 = meta10995;
this.cljs$lang$protocol_mask$partition1$ = 0;
this.cljs$lang$protocol_mask$partition0$ = 393216;
})
cljs.core.async.t10994.cljs$lang$type = true;
cljs.core.async.t10994.cljs$lang$ctorStr = "cljs.core.async/t10994";
cljs.core.async.t10994.cljs$lang$ctorPrWriter = (function (this__4010__auto__,writer__4011__auto__,opt__4012__auto__){return cljs.core._write.call(null,writer__4011__auto__,"cljs.core.async/t10994");
});
cljs.core.async.t10994.prototype.cljs$core$async$impl$protocols$Handler$ = true;
cljs.core.async.t10994.prototype.cljs$core$async$impl$protocols$Handler$active_QMARK_$arity$1 = (function (_){var self__ = this;
var ___$1 = this;return cljs.core.async.impl.protocols.active_QMARK_.call(null,self__.flag);
});
cljs.core.async.t10994.prototype.cljs$core$async$impl$protocols$Handler$commit$arity$1 = (function (_){var self__ = this;
var ___$1 = this;cljs.core.async.impl.protocols.commit.call(null,self__.flag);
return self__.cb;
});
cljs.core.async.t10994.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_10996){var self__ = this;
var _10996__$1 = this;return self__.meta10995;
});
cljs.core.async.t10994.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_10996,meta10995__$1){var self__ = this;
var _10996__$1 = this;return (new cljs.core.async.t10994(self__.cb,self__.flag,self__.alt_handler,meta10995__$1));
});
cljs.core.async.__GT_t10994 = (function __GT_t10994(cb__$1,flag__$1,alt_handler__$1,meta10995){return (new cljs.core.async.t10994(cb__$1,flag__$1,alt_handler__$1,meta10995));
});
}
return (new cljs.core.async.t10994(cb,flag,alt_handler,null));
});
/**
* returns derefable [val port] if immediate, nil if enqueued
*/
cljs.core.async.do_alts = (function do_alts(fret,ports,opts){var flag = cljs.core.async.alt_flag.call(null);var n = cljs.core.count.call(null,ports);var idxs = cljs.core.async.random_array.call(null,n);var priority = new cljs.core.Keyword(null,"priority","priority",4143410454).cljs$core$IFn$_invoke$arity$1(opts);var ret = (function (){var i = 0;while(true){
if((i < n))
{var idx = (cljs.core.truth_(priority)?i:(idxs[i]));var port = cljs.core.nth.call(null,ports,idx);var wport = ((cljs.core.vector_QMARK_.call(null,port))?port.call(null,0):null);var vbox = (cljs.core.truth_(wport)?(function (){var val = port.call(null,1);return cljs.core.async.impl.protocols.put_BANG_.call(null,wport,val,cljs.core.async.alt_handler.call(null,flag,((function (i,val,idx,port,wport,flag,n,idxs,priority){
return (function (){return fret.call(null,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [null,wport], null));
});})(i,val,idx,port,wport,flag,n,idxs,priority))
));
})():cljs.core.async.impl.protocols.take_BANG_.call(null,port,cljs.core.async.alt_handler.call(null,flag,((function (i,idx,port,wport,flag,n,idxs,priority){
return (function (p1__10997_SHARP_){return fret.call(null,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [p1__10997_SHARP_,port], null));
});})(i,idx,port,wport,flag,n,idxs,priority))
)));if(cljs.core.truth_(vbox))
{return cljs.core.async.impl.channels.box.call(null,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [cljs.core.deref.call(null,vbox),(function (){var or__3443__auto__ = wport;if(cljs.core.truth_(or__3443__auto__))
{return or__3443__auto__;
} else
{return port;
}
})()], null));
} else
{{
var G__10998 = (i + 1);
i = G__10998;
continue;
}
}
} else
{return null;
}
break;
}
})();var or__3443__auto__ = ret;if(cljs.core.truth_(or__3443__auto__))
{return or__3443__auto__;
} else
{if(cljs.core.contains_QMARK_.call(null,opts,new cljs.core.Keyword(null,"default","default",2558708147)))
{var temp__4092__auto__ = (function (){var and__3431__auto__ = cljs.core.async.impl.protocols.active_QMARK_.call(null,flag);if(cljs.core.truth_(and__3431__auto__))
{return cljs.core.async.impl.protocols.commit.call(null,flag);
} else
{return and__3431__auto__;
}
})();if(cljs.core.truth_(temp__4092__auto__))
{var got = temp__4092__auto__;return cljs.core.async.impl.channels.box.call(null,new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [new cljs.core.Keyword(null,"default","default",2558708147).cljs$core$IFn$_invoke$arity$1(opts),new cljs.core.Keyword(null,"default","default",2558708147)], null));
} else
{return null;
}
} else
{return null;
}
}
});
/**
* Completes at most one of several channel operations. Must be called
* inside a (go ...) block. ports is a vector of channel endpoints, which
* can be either a channel to take from or a vector of
* [channel-to-put-to val-to-put], in any combination. Takes will be
* made as if by <!, and puts will be made as if by >!. Unless
* the :priority option is true, if more than one port operation is
* ready a non-deterministic choice will be made. If no operation is
* ready and a :default value is supplied, [default-val :default] will
* be returned, otherwise alts! will park until the first operation to
* become ready completes. Returns [val port] of the completed
* operation, where val is the value taken for takes, and nil for puts.
* 
* opts are passed as :key val ... Supported options:
* 
* :default val - the value to use if none of the operations are immediately ready
* :priority true - (default nil) when true, the operations will be tried in order.
* 
* Note: there is no guarantee that the port exps or val exprs will be
* used, nor in what order should they be, so they should not be
* depended upon for side effects.
* @param {...*} var_args
*/
cljs.core.async.alts_BANG_ = (function() { 
var alts_BANG___delegate = function (ports,p__10999){var map__11001 = p__10999;var map__11001__$1 = ((cljs.core.seq_QMARK_.call(null,map__11001))?cljs.core.apply.call(null,cljs.core.hash_map,map__11001):map__11001);var opts = map__11001__$1;if(null)
{return null;
} else
{throw (new Error([cljs.core.str("Assert failed: "),cljs.core.str("alts! used not in (go ...) block"),cljs.core.str("\n"),cljs.core.str(cljs.core.pr_str.call(null,null))].join('')));
}
};
var alts_BANG_ = function (ports,var_args){
var p__10999 = null;if (arguments.length > 1) {
  p__10999 = cljs.core.array_seq(Array.prototype.slice.call(arguments, 1),0);} 
return alts_BANG___delegate.call(this,ports,p__10999);};
alts_BANG_.cljs$lang$maxFixedArity = 1;
alts_BANG_.cljs$lang$applyTo = (function (arglist__11002){
var ports = cljs.core.first(arglist__11002);
var p__10999 = cljs.core.rest(arglist__11002);
return alts_BANG___delegate(ports,p__10999);
});
alts_BANG_.cljs$core$IFn$_invoke$arity$variadic = alts_BANG___delegate;
return alts_BANG_;
})()
;
/**
* Takes a function and a source channel, and returns a channel which
* contains the values produced by applying f to each value taken from
* the source channel
*/
cljs.core.async.map_LT_ = (function map_LT_(f,ch){if(typeof cljs.core.async.t11010 !== 'undefined')
{} else
{
/**
* @constructor
*/
cljs.core.async.t11010 = (function (ch,f,map_LT_,meta11011){
this.ch = ch;
this.f = f;
this.map_LT_ = map_LT_;
this.meta11011 = meta11011;
this.cljs$lang$protocol_mask$partition1$ = 0;
this.cljs$lang$protocol_mask$partition0$ = 393216;
})
cljs.core.async.t11010.cljs$lang$type = true;
cljs.core.async.t11010.cljs$lang$ctorStr = "cljs.core.async/t11010";
cljs.core.async.t11010.cljs$lang$ctorPrWriter = (function (this__4010__auto__,writer__4011__auto__,opt__4012__auto__){return cljs.core._write.call(null,writer__4011__auto__,"cljs.core.async/t11010");
});
cljs.core.async.t11010.prototype.cljs$core$async$impl$protocols$WritePort$ = true;
cljs.core.async.t11010.prototype.cljs$core$async$impl$protocols$WritePort$put_BANG_$arity$3 = (function (_,val,fn0){var self__ = this;
var ___$1 = this;return cljs.core.async.impl.protocols.put_BANG_.call(null,self__.ch,val,fn0);
});
cljs.core.async.t11010.prototype.cljs$core$async$impl$protocols$ReadPort$ = true;
cljs.core.async.t11010.prototype.cljs$core$async$impl$protocols$ReadPort$take_BANG_$arity$2 = (function (_,fn1){var self__ = this;
var ___$1 = this;var ret = cljs.core.async.impl.protocols.take_BANG_.call(null,self__.ch,(function (){if(typeof cljs.core.async.t11013 !== 'undefined')
{} else
{
/**
* @constructor
*/
cljs.core.async.t11013 = (function (fn1,_,meta11011,ch,f,map_LT_,meta11014){
this.fn1 = fn1;
this._ = _;
this.meta11011 = meta11011;
this.ch = ch;
this.f = f;
this.map_LT_ = map_LT_;
this.meta11014 = meta11014;
this.cljs$lang$protocol_mask$partition1$ = 0;
this.cljs$lang$protocol_mask$partition0$ = 393216;
})
cljs.core.async.t11013.cljs$lang$type = true;
cljs.core.async.t11013.cljs$lang$ctorStr = "cljs.core.async/t11013";
cljs.core.async.t11013.cljs$lang$ctorPrWriter = (function (this__4010__auto__,writer__4011__auto__,opt__4012__auto__){return cljs.core._write.call(null,writer__4011__auto__,"cljs.core.async/t11013");
});
cljs.core.async.t11013.prototype.cljs$core$async$impl$protocols$Handler$ = true;
cljs.core.async.t11013.prototype.cljs$core$async$impl$protocols$Handler$active_QMARK_$arity$1 = (function (___$3){var self__ = this;
var ___$4 = this;return cljs.core.async.impl.protocols.active_QMARK_.call(null,self__.fn1);
});
cljs.core.async.t11013.prototype.cljs$core$async$impl$protocols$Handler$lock_id$arity$1 = (function (___$3){var self__ = this;
var ___$4 = this;return cljs.core.async.impl.protocols.lock_id.call(null,self__.fn1);
});
cljs.core.async.t11013.prototype.cljs$core$async$impl$protocols$Handler$commit$arity$1 = (function (___$3){var self__ = this;
var ___$4 = this;var f1 = cljs.core.async.impl.protocols.commit.call(null,self__.fn1);return ((function (f1,___$4){
return (function (p1__11003_SHARP_){return f1.call(null,(((p1__11003_SHARP_ == null))?null:self__.f.call(null,p1__11003_SHARP_)));
});
;})(f1,___$4))
});
cljs.core.async.t11013.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_11015){var self__ = this;
var _11015__$1 = this;return self__.meta11014;
});
cljs.core.async.t11013.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_11015,meta11014__$1){var self__ = this;
var _11015__$1 = this;return (new cljs.core.async.t11013(self__.fn1,self__._,self__.meta11011,self__.ch,self__.f,self__.map_LT_,meta11014__$1));
});
cljs.core.async.__GT_t11013 = (function __GT_t11013(fn1__$1,___$2,meta11011__$1,ch__$2,f__$2,map_LT___$2,meta11014){return (new cljs.core.async.t11013(fn1__$1,___$2,meta11011__$1,ch__$2,f__$2,map_LT___$2,meta11014));
});
}
return (new cljs.core.async.t11013(fn1,___$1,self__.meta11011,self__.ch,self__.f,self__.map_LT_,null));
})());if(cljs.core.truth_((function (){var and__3431__auto__ = ret;if(cljs.core.truth_(and__3431__auto__))
{return !((cljs.core.deref.call(null,ret) == null));
} else
{return and__3431__auto__;
}
})()))
{return cljs.core.async.impl.channels.box.call(null,self__.f.call(null,cljs.core.deref.call(null,ret)));
} else
{return ret;
}
});
cljs.core.async.t11010.prototype.cljs$core$async$impl$protocols$Channel$ = true;
cljs.core.async.t11010.prototype.cljs$core$async$impl$protocols$Channel$close_BANG_$arity$1 = (function (_){var self__ = this;
var ___$1 = this;return cljs.core.async.impl.protocols.close_BANG_.call(null,self__.ch);
});
cljs.core.async.t11010.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_11012){var self__ = this;
var _11012__$1 = this;return self__.meta11011;
});
cljs.core.async.t11010.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_11012,meta11011__$1){var self__ = this;
var _11012__$1 = this;return (new cljs.core.async.t11010(self__.ch,self__.f,self__.map_LT_,meta11011__$1));
});
cljs.core.async.__GT_t11010 = (function __GT_t11010(ch__$1,f__$1,map_LT___$1,meta11011){return (new cljs.core.async.t11010(ch__$1,f__$1,map_LT___$1,meta11011));
});
}
return (new cljs.core.async.t11010(ch,f,map_LT_,null));
});
/**
* Takes a function and a target channel, and returns a channel which
* applies f to each value before supplying it to the target channel.
*/
cljs.core.async.map_GT_ = (function map_GT_(f,ch){if(typeof cljs.core.async.t11019 !== 'undefined')
{} else
{
/**
* @constructor
*/
cljs.core.async.t11019 = (function (ch,f,map_GT_,meta11020){
this.ch = ch;
this.f = f;
this.map_GT_ = map_GT_;
this.meta11020 = meta11020;
this.cljs$lang$protocol_mask$partition1$ = 0;
this.cljs$lang$protocol_mask$partition0$ = 393216;
})
cljs.core.async.t11019.cljs$lang$type = true;
cljs.core.async.t11019.cljs$lang$ctorStr = "cljs.core.async/t11019";
cljs.core.async.t11019.cljs$lang$ctorPrWriter = (function (this__4010__auto__,writer__4011__auto__,opt__4012__auto__){return cljs.core._write.call(null,writer__4011__auto__,"cljs.core.async/t11019");
});
cljs.core.async.t11019.prototype.cljs$core$async$impl$protocols$WritePort$ = true;
cljs.core.async.t11019.prototype.cljs$core$async$impl$protocols$WritePort$put_BANG_$arity$3 = (function (_,val,fn0){var self__ = this;
var ___$1 = this;return cljs.core.async.impl.protocols.put_BANG_.call(null,self__.ch,self__.f.call(null,val),fn0);
});
cljs.core.async.t11019.prototype.cljs$core$async$impl$protocols$ReadPort$ = true;
cljs.core.async.t11019.prototype.cljs$core$async$impl$protocols$ReadPort$take_BANG_$arity$2 = (function (_,fn1){var self__ = this;
var ___$1 = this;return cljs.core.async.impl.protocols.take_BANG_.call(null,self__.ch,fn1);
});
cljs.core.async.t11019.prototype.cljs$core$async$impl$protocols$Channel$ = true;
cljs.core.async.t11019.prototype.cljs$core$async$impl$protocols$Channel$close_BANG_$arity$1 = (function (_){var self__ = this;
var ___$1 = this;return cljs.core.async.impl.protocols.close_BANG_.call(null,self__.ch);
});
cljs.core.async.t11019.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_11021){var self__ = this;
var _11021__$1 = this;return self__.meta11020;
});
cljs.core.async.t11019.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_11021,meta11020__$1){var self__ = this;
var _11021__$1 = this;return (new cljs.core.async.t11019(self__.ch,self__.f,self__.map_GT_,meta11020__$1));
});
cljs.core.async.__GT_t11019 = (function __GT_t11019(ch__$1,f__$1,map_GT___$1,meta11020){return (new cljs.core.async.t11019(ch__$1,f__$1,map_GT___$1,meta11020));
});
}
return (new cljs.core.async.t11019(ch,f,map_GT_,null));
});
/**
* Takes a predicate and a target channel, and returns a channel which
* supplies only the values for which the predicate returns true to the
* target channel.
*/
cljs.core.async.filter_GT_ = (function filter_GT_(p,ch){if(typeof cljs.core.async.t11025 !== 'undefined')
{} else
{
/**
* @constructor
*/
cljs.core.async.t11025 = (function (ch,p,filter_GT_,meta11026){
this.ch = ch;
this.p = p;
this.filter_GT_ = filter_GT_;
this.meta11026 = meta11026;
this.cljs$lang$protocol_mask$partition1$ = 0;
this.cljs$lang$protocol_mask$partition0$ = 393216;
})
cljs.core.async.t11025.cljs$lang$type = true;
cljs.core.async.t11025.cljs$lang$ctorStr = "cljs.core.async/t11025";
cljs.core.async.t11025.cljs$lang$ctorPrWriter = (function (this__4010__auto__,writer__4011__auto__,opt__4012__auto__){return cljs.core._write.call(null,writer__4011__auto__,"cljs.core.async/t11025");
});
cljs.core.async.t11025.prototype.cljs$core$async$impl$protocols$WritePort$ = true;
cljs.core.async.t11025.prototype.cljs$core$async$impl$protocols$WritePort$put_BANG_$arity$3 = (function (_,val,fn0){var self__ = this;
var ___$1 = this;if(cljs.core.truth_(self__.p.call(null,val)))
{return cljs.core.async.impl.protocols.put_BANG_.call(null,self__.ch,val,fn0);
} else
{return cljs.core.async.impl.channels.box.call(null,null);
}
});
cljs.core.async.t11025.prototype.cljs$core$async$impl$protocols$ReadPort$ = true;
cljs.core.async.t11025.prototype.cljs$core$async$impl$protocols$ReadPort$take_BANG_$arity$2 = (function (_,fn1){var self__ = this;
var ___$1 = this;return cljs.core.async.impl.protocols.take_BANG_.call(null,self__.ch,fn1);
});
cljs.core.async.t11025.prototype.cljs$core$async$impl$protocols$Channel$ = true;
cljs.core.async.t11025.prototype.cljs$core$async$impl$protocols$Channel$close_BANG_$arity$1 = (function (_){var self__ = this;
var ___$1 = this;return cljs.core.async.impl.protocols.close_BANG_.call(null,self__.ch);
});
cljs.core.async.t11025.prototype.cljs$core$IMeta$_meta$arity$1 = (function (_11027){var self__ = this;
var _11027__$1 = this;return self__.meta11026;
});
cljs.core.async.t11025.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = (function (_11027,meta11026__$1){var self__ = this;
var _11027__$1 = this;return (new cljs.core.async.t11025(self__.ch,self__.p,self__.filter_GT_,meta11026__$1));
});
cljs.core.async.__GT_t11025 = (function __GT_t11025(ch__$1,p__$1,filter_GT___$1,meta11026){return (new cljs.core.async.t11025(ch__$1,p__$1,filter_GT___$1,meta11026));
});
}
return (new cljs.core.async.t11025(ch,p,filter_GT_,null));
});
/**
* Takes a predicate and a target channel, and returns a channel which
* supplies only the values for which the predicate returns false to the
* target channel.
*/
cljs.core.async.remove_GT_ = (function remove_GT_(p,ch){return cljs.core.async.filter_GT_.call(null,cljs.core.complement.call(null,p),ch);
});
/**
* Takes a predicate and a source channel, and returns a channel which
* contains only the values taken from the source channel for which the
* predicate returns true. The returned channel will be unbuffered by
* default, or a buf-or-n can be supplied. The channel will close
* when the source channel closes.
*/
cljs.core.async.filter_LT_ = (function() {
var filter_LT_ = null;
var filter_LT___2 = (function (p,ch){return filter_LT_.call(null,p,ch,null);
});
var filter_LT___3 = (function (p,ch,buf_or_n){var out = cljs.core.async.chan.call(null,buf_or_n);var c__6192__auto___11110 = cljs.core.async.chan.call(null,1);cljs.core.async.impl.dispatch.run.call(null,(function (){var f__6193__auto__ = (function (){var switch__6177__auto__ = (function (state_11089){var state_val_11090 = (state_11089[1]);if((state_val_11090 === 1))
{var state_11089__$1 = state_11089;var statearr_11091_11111 = state_11089__$1;(statearr_11091_11111[2] = null);
(statearr_11091_11111[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11090 === 2))
{var state_11089__$1 = state_11089;return cljs.core.async.impl.ioc_helpers.take_BANG_.call(null,state_11089__$1,4,ch);
} else
{if((state_val_11090 === 3))
{var inst_11087 = (state_11089[2]);var state_11089__$1 = state_11089;return cljs.core.async.impl.ioc_helpers.return_chan.call(null,state_11089__$1,inst_11087);
} else
{if((state_val_11090 === 4))
{var inst_11071 = (state_11089[7]);var inst_11071__$1 = (state_11089[2]);var inst_11072 = (inst_11071__$1 == null);var state_11089__$1 = (function (){var statearr_11092 = state_11089;(statearr_11092[7] = inst_11071__$1);
return statearr_11092;
})();if(cljs.core.truth_(inst_11072))
{var statearr_11093_11112 = state_11089__$1;(statearr_11093_11112[1] = 5);
} else
{var statearr_11094_11113 = state_11089__$1;(statearr_11094_11113[1] = 6);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11090 === 5))
{var inst_11074 = cljs.core.async.close_BANG_.call(null,out);var state_11089__$1 = state_11089;var statearr_11095_11114 = state_11089__$1;(statearr_11095_11114[2] = inst_11074);
(statearr_11095_11114[1] = 7);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11090 === 6))
{var inst_11071 = (state_11089[7]);var inst_11076 = p.call(null,inst_11071);var state_11089__$1 = state_11089;if(cljs.core.truth_(inst_11076))
{var statearr_11096_11115 = state_11089__$1;(statearr_11096_11115[1] = 8);
} else
{var statearr_11097_11116 = state_11089__$1;(statearr_11097_11116[1] = 9);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11090 === 7))
{var inst_11085 = (state_11089[2]);var state_11089__$1 = state_11089;var statearr_11098_11117 = state_11089__$1;(statearr_11098_11117[2] = inst_11085);
(statearr_11098_11117[1] = 3);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11090 === 8))
{var inst_11071 = (state_11089[7]);var state_11089__$1 = state_11089;return cljs.core.async.impl.ioc_helpers.put_BANG_.call(null,state_11089__$1,11,out,inst_11071);
} else
{if((state_val_11090 === 9))
{var state_11089__$1 = state_11089;var statearr_11099_11118 = state_11089__$1;(statearr_11099_11118[2] = null);
(statearr_11099_11118[1] = 10);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11090 === 10))
{var inst_11082 = (state_11089[2]);var state_11089__$1 = (function (){var statearr_11100 = state_11089;(statearr_11100[8] = inst_11082);
return statearr_11100;
})();var statearr_11101_11119 = state_11089__$1;(statearr_11101_11119[2] = null);
(statearr_11101_11119[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11090 === 11))
{var inst_11079 = (state_11089[2]);var state_11089__$1 = state_11089;var statearr_11102_11120 = state_11089__$1;(statearr_11102_11120[2] = inst_11079);
(statearr_11102_11120[1] = 10);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{return null;
}
}
}
}
}
}
}
}
}
}
}
});return ((function (switch__6177__auto__){
return (function() {
var state_machine__6178__auto__ = null;
var state_machine__6178__auto____0 = (function (){var statearr_11106 = [null,null,null,null,null,null,null,null,null];(statearr_11106[0] = state_machine__6178__auto__);
(statearr_11106[1] = 1);
return statearr_11106;
});
var state_machine__6178__auto____1 = (function (state_11089){while(true){
var ret_value__6179__auto__ = (function (){try{while(true){
var result__6180__auto__ = switch__6177__auto__.call(null,state_11089);if(cljs.core.keyword_identical_QMARK_.call(null,result__6180__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
continue;
}
} else
{return result__6180__auto__;
}
break;
}
}catch (e11107){if((e11107 instanceof Object))
{var ex__6181__auto__ = e11107;var statearr_11108_11121 = state_11089;(statearr_11108_11121[5] = ex__6181__auto__);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_11089);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if(new cljs.core.Keyword(null,"else","else",1017020587))
{throw e11107;
} else
{return null;
}
}
}})();if(cljs.core.keyword_identical_QMARK_.call(null,ret_value__6179__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
var G__11122 = state_11089;
state_11089 = G__11122;
continue;
}
} else
{return ret_value__6179__auto__;
}
break;
}
});
state_machine__6178__auto__ = function(state_11089){
switch(arguments.length){
case 0:
return state_machine__6178__auto____0.call(this);
case 1:
return state_machine__6178__auto____1.call(this,state_11089);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$0 = state_machine__6178__auto____0;
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$1 = state_machine__6178__auto____1;
return state_machine__6178__auto__;
})()
;})(switch__6177__auto__))
})();var state__6194__auto__ = (function (){var statearr_11109 = f__6193__auto__.call(null);(statearr_11109[cljs.core.async.impl.ioc_helpers.USER_START_IDX] = c__6192__auto___11110);
return statearr_11109;
})();return cljs.core.async.impl.ioc_helpers.run_state_machine_wrapped.call(null,state__6194__auto__);
}));
return out;
});
filter_LT_ = function(p,ch,buf_or_n){
switch(arguments.length){
case 2:
return filter_LT___2.call(this,p,ch);
case 3:
return filter_LT___3.call(this,p,ch,buf_or_n);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
filter_LT_.cljs$core$IFn$_invoke$arity$2 = filter_LT___2;
filter_LT_.cljs$core$IFn$_invoke$arity$3 = filter_LT___3;
return filter_LT_;
})()
;
/**
* Takes a predicate and a source channel, and returns a channel which
* contains only the values taken from the source channel for which the
* predicate returns false. The returned channel will be unbuffered by
* default, or a buf-or-n can be supplied. The channel will close
* when the source channel closes.
*/
cljs.core.async.remove_LT_ = (function() {
var remove_LT_ = null;
var remove_LT___2 = (function (p,ch){return remove_LT_.call(null,p,ch,null);
});
var remove_LT___3 = (function (p,ch,buf_or_n){return cljs.core.async.filter_LT_.call(null,cljs.core.complement.call(null,p),ch,buf_or_n);
});
remove_LT_ = function(p,ch,buf_or_n){
switch(arguments.length){
case 2:
return remove_LT___2.call(this,p,ch);
case 3:
return remove_LT___3.call(this,p,ch,buf_or_n);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
remove_LT_.cljs$core$IFn$_invoke$arity$2 = remove_LT___2;
remove_LT_.cljs$core$IFn$_invoke$arity$3 = remove_LT___3;
return remove_LT_;
})()
;
cljs.core.async.mapcat_STAR_ = (function mapcat_STAR_(f,in$,out){var c__6192__auto__ = cljs.core.async.chan.call(null,1);cljs.core.async.impl.dispatch.run.call(null,(function (){var f__6193__auto__ = (function (){var switch__6177__auto__ = (function (state_11274){var state_val_11275 = (state_11274[1]);if((state_val_11275 === 1))
{var state_11274__$1 = state_11274;var statearr_11276_11313 = state_11274__$1;(statearr_11276_11313[2] = null);
(statearr_11276_11313[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11275 === 2))
{var state_11274__$1 = state_11274;return cljs.core.async.impl.ioc_helpers.take_BANG_.call(null,state_11274__$1,4,in$);
} else
{if((state_val_11275 === 3))
{var inst_11272 = (state_11274[2]);var state_11274__$1 = state_11274;return cljs.core.async.impl.ioc_helpers.return_chan.call(null,state_11274__$1,inst_11272);
} else
{if((state_val_11275 === 4))
{var inst_11220 = (state_11274[7]);var inst_11220__$1 = (state_11274[2]);var inst_11221 = (inst_11220__$1 == null);var state_11274__$1 = (function (){var statearr_11277 = state_11274;(statearr_11277[7] = inst_11220__$1);
return statearr_11277;
})();if(cljs.core.truth_(inst_11221))
{var statearr_11278_11314 = state_11274__$1;(statearr_11278_11314[1] = 5);
} else
{var statearr_11279_11315 = state_11274__$1;(statearr_11279_11315[1] = 6);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11275 === 5))
{var inst_11223 = cljs.core.async.close_BANG_.call(null,out);var state_11274__$1 = state_11274;var statearr_11280_11316 = state_11274__$1;(statearr_11280_11316[2] = inst_11223);
(statearr_11280_11316[1] = 7);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11275 === 6))
{var inst_11220 = (state_11274[7]);var inst_11225 = f.call(null,inst_11220);var inst_11230 = cljs.core.seq.call(null,inst_11225);var inst_11231 = inst_11230;var inst_11232 = null;var inst_11233 = 0;var inst_11234 = 0;var state_11274__$1 = (function (){var statearr_11281 = state_11274;(statearr_11281[8] = inst_11231);
(statearr_11281[9] = inst_11234);
(statearr_11281[10] = inst_11233);
(statearr_11281[11] = inst_11232);
return statearr_11281;
})();var statearr_11282_11317 = state_11274__$1;(statearr_11282_11317[2] = null);
(statearr_11282_11317[1] = 8);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11275 === 7))
{var inst_11270 = (state_11274[2]);var state_11274__$1 = state_11274;var statearr_11283_11318 = state_11274__$1;(statearr_11283_11318[2] = inst_11270);
(statearr_11283_11318[1] = 3);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11275 === 8))
{var inst_11234 = (state_11274[9]);var inst_11233 = (state_11274[10]);var inst_11236 = (inst_11234 < inst_11233);var inst_11237 = inst_11236;var state_11274__$1 = state_11274;if(cljs.core.truth_(inst_11237))
{var statearr_11284_11319 = state_11274__$1;(statearr_11284_11319[1] = 10);
} else
{var statearr_11285_11320 = state_11274__$1;(statearr_11285_11320[1] = 11);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11275 === 9))
{var inst_11267 = (state_11274[2]);var state_11274__$1 = (function (){var statearr_11286 = state_11274;(statearr_11286[12] = inst_11267);
return statearr_11286;
})();var statearr_11287_11321 = state_11274__$1;(statearr_11287_11321[2] = null);
(statearr_11287_11321[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11275 === 10))
{var inst_11234 = (state_11274[9]);var inst_11232 = (state_11274[11]);var inst_11239 = cljs.core._nth.call(null,inst_11232,inst_11234);var state_11274__$1 = state_11274;return cljs.core.async.impl.ioc_helpers.put_BANG_.call(null,state_11274__$1,13,out,inst_11239);
} else
{if((state_val_11275 === 11))
{var inst_11231 = (state_11274[8]);var inst_11245 = (state_11274[13]);var inst_11245__$1 = cljs.core.seq.call(null,inst_11231);var state_11274__$1 = (function (){var statearr_11291 = state_11274;(statearr_11291[13] = inst_11245__$1);
return statearr_11291;
})();if(inst_11245__$1)
{var statearr_11292_11322 = state_11274__$1;(statearr_11292_11322[1] = 14);
} else
{var statearr_11293_11323 = state_11274__$1;(statearr_11293_11323[1] = 15);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11275 === 12))
{var inst_11265 = (state_11274[2]);var state_11274__$1 = state_11274;var statearr_11294_11324 = state_11274__$1;(statearr_11294_11324[2] = inst_11265);
(statearr_11294_11324[1] = 9);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11275 === 13))
{var inst_11231 = (state_11274[8]);var inst_11234 = (state_11274[9]);var inst_11233 = (state_11274[10]);var inst_11232 = (state_11274[11]);var inst_11241 = (state_11274[2]);var inst_11242 = (inst_11234 + 1);var tmp11288 = inst_11231;var tmp11289 = inst_11233;var tmp11290 = inst_11232;var inst_11231__$1 = tmp11288;var inst_11232__$1 = tmp11290;var inst_11233__$1 = tmp11289;var inst_11234__$1 = inst_11242;var state_11274__$1 = (function (){var statearr_11295 = state_11274;(statearr_11295[8] = inst_11231__$1);
(statearr_11295[14] = inst_11241);
(statearr_11295[9] = inst_11234__$1);
(statearr_11295[10] = inst_11233__$1);
(statearr_11295[11] = inst_11232__$1);
return statearr_11295;
})();var statearr_11296_11325 = state_11274__$1;(statearr_11296_11325[2] = null);
(statearr_11296_11325[1] = 8);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11275 === 14))
{var inst_11245 = (state_11274[13]);var inst_11247 = cljs.core.chunked_seq_QMARK_.call(null,inst_11245);var state_11274__$1 = state_11274;if(inst_11247)
{var statearr_11297_11326 = state_11274__$1;(statearr_11297_11326[1] = 17);
} else
{var statearr_11298_11327 = state_11274__$1;(statearr_11298_11327[1] = 18);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11275 === 15))
{var state_11274__$1 = state_11274;var statearr_11299_11328 = state_11274__$1;(statearr_11299_11328[2] = null);
(statearr_11299_11328[1] = 16);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11275 === 16))
{var inst_11263 = (state_11274[2]);var state_11274__$1 = state_11274;var statearr_11300_11329 = state_11274__$1;(statearr_11300_11329[2] = inst_11263);
(statearr_11300_11329[1] = 12);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11275 === 17))
{var inst_11245 = (state_11274[13]);var inst_11249 = cljs.core.chunk_first.call(null,inst_11245);var inst_11250 = cljs.core.chunk_rest.call(null,inst_11245);var inst_11251 = cljs.core.count.call(null,inst_11249);var inst_11231 = inst_11250;var inst_11232 = inst_11249;var inst_11233 = inst_11251;var inst_11234 = 0;var state_11274__$1 = (function (){var statearr_11301 = state_11274;(statearr_11301[8] = inst_11231);
(statearr_11301[9] = inst_11234);
(statearr_11301[10] = inst_11233);
(statearr_11301[11] = inst_11232);
return statearr_11301;
})();var statearr_11302_11330 = state_11274__$1;(statearr_11302_11330[2] = null);
(statearr_11302_11330[1] = 8);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11275 === 18))
{var inst_11245 = (state_11274[13]);var inst_11254 = cljs.core.first.call(null,inst_11245);var state_11274__$1 = state_11274;return cljs.core.async.impl.ioc_helpers.put_BANG_.call(null,state_11274__$1,20,out,inst_11254);
} else
{if((state_val_11275 === 19))
{var inst_11260 = (state_11274[2]);var state_11274__$1 = state_11274;var statearr_11303_11331 = state_11274__$1;(statearr_11303_11331[2] = inst_11260);
(statearr_11303_11331[1] = 16);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11275 === 20))
{var inst_11245 = (state_11274[13]);var inst_11256 = (state_11274[2]);var inst_11257 = cljs.core.next.call(null,inst_11245);var inst_11231 = inst_11257;var inst_11232 = null;var inst_11233 = 0;var inst_11234 = 0;var state_11274__$1 = (function (){var statearr_11304 = state_11274;(statearr_11304[15] = inst_11256);
(statearr_11304[8] = inst_11231);
(statearr_11304[9] = inst_11234);
(statearr_11304[10] = inst_11233);
(statearr_11304[11] = inst_11232);
return statearr_11304;
})();var statearr_11305_11332 = state_11274__$1;(statearr_11305_11332[2] = null);
(statearr_11305_11332[1] = 8);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{return null;
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
});return ((function (switch__6177__auto__){
return (function() {
var state_machine__6178__auto__ = null;
var state_machine__6178__auto____0 = (function (){var statearr_11309 = [null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null];(statearr_11309[0] = state_machine__6178__auto__);
(statearr_11309[1] = 1);
return statearr_11309;
});
var state_machine__6178__auto____1 = (function (state_11274){while(true){
var ret_value__6179__auto__ = (function (){try{while(true){
var result__6180__auto__ = switch__6177__auto__.call(null,state_11274);if(cljs.core.keyword_identical_QMARK_.call(null,result__6180__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
continue;
}
} else
{return result__6180__auto__;
}
break;
}
}catch (e11310){if((e11310 instanceof Object))
{var ex__6181__auto__ = e11310;var statearr_11311_11333 = state_11274;(statearr_11311_11333[5] = ex__6181__auto__);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_11274);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if(new cljs.core.Keyword(null,"else","else",1017020587))
{throw e11310;
} else
{return null;
}
}
}})();if(cljs.core.keyword_identical_QMARK_.call(null,ret_value__6179__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
var G__11334 = state_11274;
state_11274 = G__11334;
continue;
}
} else
{return ret_value__6179__auto__;
}
break;
}
});
state_machine__6178__auto__ = function(state_11274){
switch(arguments.length){
case 0:
return state_machine__6178__auto____0.call(this);
case 1:
return state_machine__6178__auto____1.call(this,state_11274);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$0 = state_machine__6178__auto____0;
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$1 = state_machine__6178__auto____1;
return state_machine__6178__auto__;
})()
;})(switch__6177__auto__))
})();var state__6194__auto__ = (function (){var statearr_11312 = f__6193__auto__.call(null);(statearr_11312[cljs.core.async.impl.ioc_helpers.USER_START_IDX] = c__6192__auto__);
return statearr_11312;
})();return cljs.core.async.impl.ioc_helpers.run_state_machine_wrapped.call(null,state__6194__auto__);
}));
return c__6192__auto__;
});
/**
* Takes a function and a source channel, and returns a channel which
* contains the values in each collection produced by applying f to
* each value taken from the source channel. f must return a
* collection.
* 
* The returned channel will be unbuffered by default, or a buf-or-n
* can be supplied. The channel will close when the source channel
* closes.
*/
cljs.core.async.mapcat_LT_ = (function() {
var mapcat_LT_ = null;
var mapcat_LT___2 = (function (f,in$){return mapcat_LT_.call(null,f,in$,null);
});
var mapcat_LT___3 = (function (f,in$,buf_or_n){var out = cljs.core.async.chan.call(null,buf_or_n);cljs.core.async.mapcat_STAR_.call(null,f,in$,out);
return out;
});
mapcat_LT_ = function(f,in$,buf_or_n){
switch(arguments.length){
case 2:
return mapcat_LT___2.call(this,f,in$);
case 3:
return mapcat_LT___3.call(this,f,in$,buf_or_n);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
mapcat_LT_.cljs$core$IFn$_invoke$arity$2 = mapcat_LT___2;
mapcat_LT_.cljs$core$IFn$_invoke$arity$3 = mapcat_LT___3;
return mapcat_LT_;
})()
;
/**
* Takes a function and a target channel, and returns a channel which
* applies f to each value put, then supplies each element of the result
* to the target channel. f must return a collection.
* 
* The returned channel will be unbuffered by default, or a buf-or-n
* can be supplied. The target channel will be closed when the source
* channel closes.
*/
cljs.core.async.mapcat_GT_ = (function() {
var mapcat_GT_ = null;
var mapcat_GT___2 = (function (f,out){return mapcat_GT_.call(null,f,out,null);
});
var mapcat_GT___3 = (function (f,out,buf_or_n){var in$ = cljs.core.async.chan.call(null,buf_or_n);cljs.core.async.mapcat_STAR_.call(null,f,in$,out);
return in$;
});
mapcat_GT_ = function(f,out,buf_or_n){
switch(arguments.length){
case 2:
return mapcat_GT___2.call(this,f,out);
case 3:
return mapcat_GT___3.call(this,f,out,buf_or_n);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
mapcat_GT_.cljs$core$IFn$_invoke$arity$2 = mapcat_GT___2;
mapcat_GT_.cljs$core$IFn$_invoke$arity$3 = mapcat_GT___3;
return mapcat_GT_;
})()
;
/**
* Takes elements from the from channel and supplies them to the to
* channel. By default, the to channel will be closed when the
* from channel closes, but can be determined by the close?
* parameter.
*/
cljs.core.async.pipe = (function() {
var pipe = null;
var pipe__2 = (function (from,to){return pipe.call(null,from,to,true);
});
var pipe__3 = (function (from,to,close_QMARK_){var c__6192__auto___11415 = cljs.core.async.chan.call(null,1);cljs.core.async.impl.dispatch.run.call(null,(function (){var f__6193__auto__ = (function (){var switch__6177__auto__ = (function (state_11394){var state_val_11395 = (state_11394[1]);if((state_val_11395 === 1))
{var state_11394__$1 = state_11394;var statearr_11396_11416 = state_11394__$1;(statearr_11396_11416[2] = null);
(statearr_11396_11416[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11395 === 2))
{var state_11394__$1 = state_11394;return cljs.core.async.impl.ioc_helpers.take_BANG_.call(null,state_11394__$1,4,from);
} else
{if((state_val_11395 === 3))
{var inst_11392 = (state_11394[2]);var state_11394__$1 = state_11394;return cljs.core.async.impl.ioc_helpers.return_chan.call(null,state_11394__$1,inst_11392);
} else
{if((state_val_11395 === 4))
{var inst_11377 = (state_11394[7]);var inst_11377__$1 = (state_11394[2]);var inst_11378 = (inst_11377__$1 == null);var state_11394__$1 = (function (){var statearr_11397 = state_11394;(statearr_11397[7] = inst_11377__$1);
return statearr_11397;
})();if(cljs.core.truth_(inst_11378))
{var statearr_11398_11417 = state_11394__$1;(statearr_11398_11417[1] = 5);
} else
{var statearr_11399_11418 = state_11394__$1;(statearr_11399_11418[1] = 6);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11395 === 5))
{var state_11394__$1 = state_11394;if(cljs.core.truth_(close_QMARK_))
{var statearr_11400_11419 = state_11394__$1;(statearr_11400_11419[1] = 8);
} else
{var statearr_11401_11420 = state_11394__$1;(statearr_11401_11420[1] = 9);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11395 === 6))
{var inst_11377 = (state_11394[7]);var state_11394__$1 = state_11394;return cljs.core.async.impl.ioc_helpers.put_BANG_.call(null,state_11394__$1,11,to,inst_11377);
} else
{if((state_val_11395 === 7))
{var inst_11390 = (state_11394[2]);var state_11394__$1 = state_11394;var statearr_11402_11421 = state_11394__$1;(statearr_11402_11421[2] = inst_11390);
(statearr_11402_11421[1] = 3);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11395 === 8))
{var inst_11381 = cljs.core.async.close_BANG_.call(null,to);var state_11394__$1 = state_11394;var statearr_11403_11422 = state_11394__$1;(statearr_11403_11422[2] = inst_11381);
(statearr_11403_11422[1] = 10);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11395 === 9))
{var state_11394__$1 = state_11394;var statearr_11404_11423 = state_11394__$1;(statearr_11404_11423[2] = null);
(statearr_11404_11423[1] = 10);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11395 === 10))
{var inst_11384 = (state_11394[2]);var state_11394__$1 = state_11394;var statearr_11405_11424 = state_11394__$1;(statearr_11405_11424[2] = inst_11384);
(statearr_11405_11424[1] = 7);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11395 === 11))
{var inst_11387 = (state_11394[2]);var state_11394__$1 = (function (){var statearr_11406 = state_11394;(statearr_11406[8] = inst_11387);
return statearr_11406;
})();var statearr_11407_11425 = state_11394__$1;(statearr_11407_11425[2] = null);
(statearr_11407_11425[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{return null;
}
}
}
}
}
}
}
}
}
}
}
});return ((function (switch__6177__auto__){
return (function() {
var state_machine__6178__auto__ = null;
var state_machine__6178__auto____0 = (function (){var statearr_11411 = [null,null,null,null,null,null,null,null,null];(statearr_11411[0] = state_machine__6178__auto__);
(statearr_11411[1] = 1);
return statearr_11411;
});
var state_machine__6178__auto____1 = (function (state_11394){while(true){
var ret_value__6179__auto__ = (function (){try{while(true){
var result__6180__auto__ = switch__6177__auto__.call(null,state_11394);if(cljs.core.keyword_identical_QMARK_.call(null,result__6180__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
continue;
}
} else
{return result__6180__auto__;
}
break;
}
}catch (e11412){if((e11412 instanceof Object))
{var ex__6181__auto__ = e11412;var statearr_11413_11426 = state_11394;(statearr_11413_11426[5] = ex__6181__auto__);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_11394);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if(new cljs.core.Keyword(null,"else","else",1017020587))
{throw e11412;
} else
{return null;
}
}
}})();if(cljs.core.keyword_identical_QMARK_.call(null,ret_value__6179__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
var G__11427 = state_11394;
state_11394 = G__11427;
continue;
}
} else
{return ret_value__6179__auto__;
}
break;
}
});
state_machine__6178__auto__ = function(state_11394){
switch(arguments.length){
case 0:
return state_machine__6178__auto____0.call(this);
case 1:
return state_machine__6178__auto____1.call(this,state_11394);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$0 = state_machine__6178__auto____0;
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$1 = state_machine__6178__auto____1;
return state_machine__6178__auto__;
})()
;})(switch__6177__auto__))
})();var state__6194__auto__ = (function (){var statearr_11414 = f__6193__auto__.call(null);(statearr_11414[cljs.core.async.impl.ioc_helpers.USER_START_IDX] = c__6192__auto___11415);
return statearr_11414;
})();return cljs.core.async.impl.ioc_helpers.run_state_machine_wrapped.call(null,state__6194__auto__);
}));
return to;
});
pipe = function(from,to,close_QMARK_){
switch(arguments.length){
case 2:
return pipe__2.call(this,from,to);
case 3:
return pipe__3.call(this,from,to,close_QMARK_);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
pipe.cljs$core$IFn$_invoke$arity$2 = pipe__2;
pipe.cljs$core$IFn$_invoke$arity$3 = pipe__3;
return pipe;
})()
;
/**
* Takes a predicate and a source channel and returns a vector of two
* channels, the first of which will contain the values for which the
* predicate returned true, the second those for which it returned
* false.
* 
* The out channels will be unbuffered by default, or two buf-or-ns can
* be supplied. The channels will close after the source channel has
* closed.
*/
cljs.core.async.split = (function() {
var split = null;
var split__2 = (function (p,ch){return split.call(null,p,ch,null,null);
});
var split__4 = (function (p,ch,t_buf_or_n,f_buf_or_n){var tc = cljs.core.async.chan.call(null,t_buf_or_n);var fc = cljs.core.async.chan.call(null,f_buf_or_n);var c__6192__auto___11514 = cljs.core.async.chan.call(null,1);cljs.core.async.impl.dispatch.run.call(null,(function (){var f__6193__auto__ = (function (){var switch__6177__auto__ = (function (state_11492){var state_val_11493 = (state_11492[1]);if((state_val_11493 === 1))
{var state_11492__$1 = state_11492;var statearr_11494_11515 = state_11492__$1;(statearr_11494_11515[2] = null);
(statearr_11494_11515[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11493 === 2))
{var state_11492__$1 = state_11492;return cljs.core.async.impl.ioc_helpers.take_BANG_.call(null,state_11492__$1,4,ch);
} else
{if((state_val_11493 === 3))
{var inst_11490 = (state_11492[2]);var state_11492__$1 = state_11492;return cljs.core.async.impl.ioc_helpers.return_chan.call(null,state_11492__$1,inst_11490);
} else
{if((state_val_11493 === 4))
{var inst_11473 = (state_11492[7]);var inst_11473__$1 = (state_11492[2]);var inst_11474 = (inst_11473__$1 == null);var state_11492__$1 = (function (){var statearr_11495 = state_11492;(statearr_11495[7] = inst_11473__$1);
return statearr_11495;
})();if(cljs.core.truth_(inst_11474))
{var statearr_11496_11516 = state_11492__$1;(statearr_11496_11516[1] = 5);
} else
{var statearr_11497_11517 = state_11492__$1;(statearr_11497_11517[1] = 6);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11493 === 5))
{var inst_11476 = cljs.core.async.close_BANG_.call(null,tc);var inst_11477 = cljs.core.async.close_BANG_.call(null,fc);var state_11492__$1 = (function (){var statearr_11498 = state_11492;(statearr_11498[8] = inst_11476);
return statearr_11498;
})();var statearr_11499_11518 = state_11492__$1;(statearr_11499_11518[2] = inst_11477);
(statearr_11499_11518[1] = 7);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11493 === 6))
{var inst_11473 = (state_11492[7]);var inst_11479 = p.call(null,inst_11473);var state_11492__$1 = state_11492;if(cljs.core.truth_(inst_11479))
{var statearr_11500_11519 = state_11492__$1;(statearr_11500_11519[1] = 9);
} else
{var statearr_11501_11520 = state_11492__$1;(statearr_11501_11520[1] = 10);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11493 === 7))
{var inst_11488 = (state_11492[2]);var state_11492__$1 = state_11492;var statearr_11502_11521 = state_11492__$1;(statearr_11502_11521[2] = inst_11488);
(statearr_11502_11521[1] = 3);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11493 === 8))
{var inst_11485 = (state_11492[2]);var state_11492__$1 = (function (){var statearr_11503 = state_11492;(statearr_11503[9] = inst_11485);
return statearr_11503;
})();var statearr_11504_11522 = state_11492__$1;(statearr_11504_11522[2] = null);
(statearr_11504_11522[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11493 === 9))
{var state_11492__$1 = state_11492;var statearr_11505_11523 = state_11492__$1;(statearr_11505_11523[2] = tc);
(statearr_11505_11523[1] = 11);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11493 === 10))
{var state_11492__$1 = state_11492;var statearr_11506_11524 = state_11492__$1;(statearr_11506_11524[2] = fc);
(statearr_11506_11524[1] = 11);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11493 === 11))
{var inst_11473 = (state_11492[7]);var inst_11483 = (state_11492[2]);var state_11492__$1 = state_11492;return cljs.core.async.impl.ioc_helpers.put_BANG_.call(null,state_11492__$1,8,inst_11483,inst_11473);
} else
{return null;
}
}
}
}
}
}
}
}
}
}
}
});return ((function (switch__6177__auto__){
return (function() {
var state_machine__6178__auto__ = null;
var state_machine__6178__auto____0 = (function (){var statearr_11510 = [null,null,null,null,null,null,null,null,null,null];(statearr_11510[0] = state_machine__6178__auto__);
(statearr_11510[1] = 1);
return statearr_11510;
});
var state_machine__6178__auto____1 = (function (state_11492){while(true){
var ret_value__6179__auto__ = (function (){try{while(true){
var result__6180__auto__ = switch__6177__auto__.call(null,state_11492);if(cljs.core.keyword_identical_QMARK_.call(null,result__6180__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
continue;
}
} else
{return result__6180__auto__;
}
break;
}
}catch (e11511){if((e11511 instanceof Object))
{var ex__6181__auto__ = e11511;var statearr_11512_11525 = state_11492;(statearr_11512_11525[5] = ex__6181__auto__);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_11492);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if(new cljs.core.Keyword(null,"else","else",1017020587))
{throw e11511;
} else
{return null;
}
}
}})();if(cljs.core.keyword_identical_QMARK_.call(null,ret_value__6179__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
var G__11526 = state_11492;
state_11492 = G__11526;
continue;
}
} else
{return ret_value__6179__auto__;
}
break;
}
});
state_machine__6178__auto__ = function(state_11492){
switch(arguments.length){
case 0:
return state_machine__6178__auto____0.call(this);
case 1:
return state_machine__6178__auto____1.call(this,state_11492);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$0 = state_machine__6178__auto____0;
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$1 = state_machine__6178__auto____1;
return state_machine__6178__auto__;
})()
;})(switch__6177__auto__))
})();var state__6194__auto__ = (function (){var statearr_11513 = f__6193__auto__.call(null);(statearr_11513[cljs.core.async.impl.ioc_helpers.USER_START_IDX] = c__6192__auto___11514);
return statearr_11513;
})();return cljs.core.async.impl.ioc_helpers.run_state_machine_wrapped.call(null,state__6194__auto__);
}));
return new cljs.core.PersistentVector(null, 2, 5, cljs.core.PersistentVector.EMPTY_NODE, [tc,fc], null);
});
split = function(p,ch,t_buf_or_n,f_buf_or_n){
switch(arguments.length){
case 2:
return split__2.call(this,p,ch);
case 4:
return split__4.call(this,p,ch,t_buf_or_n,f_buf_or_n);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
split.cljs$core$IFn$_invoke$arity$2 = split__2;
split.cljs$core$IFn$_invoke$arity$4 = split__4;
return split;
})()
;
/**
* f should be a function of 2 arguments. Returns a channel containing
* the single result of applying f to init and the first item from the
* channel, then applying f to that result and the 2nd item, etc. If
* the channel closes without yielding items, returns init and f is not
* called. ch must close before reduce produces a result.
*/
cljs.core.async.reduce = (function reduce(f,init,ch){var c__6192__auto__ = cljs.core.async.chan.call(null,1);cljs.core.async.impl.dispatch.run.call(null,(function (){var f__6193__auto__ = (function (){var switch__6177__auto__ = (function (state_11573){var state_val_11574 = (state_11573[1]);if((state_val_11574 === 7))
{var inst_11569 = (state_11573[2]);var state_11573__$1 = state_11573;var statearr_11575_11591 = state_11573__$1;(statearr_11575_11591[2] = inst_11569);
(statearr_11575_11591[1] = 3);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11574 === 6))
{var inst_11559 = (state_11573[7]);var inst_11562 = (state_11573[8]);var inst_11566 = f.call(null,inst_11559,inst_11562);var inst_11559__$1 = inst_11566;var state_11573__$1 = (function (){var statearr_11576 = state_11573;(statearr_11576[7] = inst_11559__$1);
return statearr_11576;
})();var statearr_11577_11592 = state_11573__$1;(statearr_11577_11592[2] = null);
(statearr_11577_11592[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11574 === 5))
{var inst_11559 = (state_11573[7]);var state_11573__$1 = state_11573;var statearr_11578_11593 = state_11573__$1;(statearr_11578_11593[2] = inst_11559);
(statearr_11578_11593[1] = 7);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11574 === 4))
{var inst_11562 = (state_11573[8]);var inst_11562__$1 = (state_11573[2]);var inst_11563 = (inst_11562__$1 == null);var state_11573__$1 = (function (){var statearr_11579 = state_11573;(statearr_11579[8] = inst_11562__$1);
return statearr_11579;
})();if(cljs.core.truth_(inst_11563))
{var statearr_11580_11594 = state_11573__$1;(statearr_11580_11594[1] = 5);
} else
{var statearr_11581_11595 = state_11573__$1;(statearr_11581_11595[1] = 6);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11574 === 3))
{var inst_11571 = (state_11573[2]);var state_11573__$1 = state_11573;return cljs.core.async.impl.ioc_helpers.return_chan.call(null,state_11573__$1,inst_11571);
} else
{if((state_val_11574 === 2))
{var state_11573__$1 = state_11573;return cljs.core.async.impl.ioc_helpers.take_BANG_.call(null,state_11573__$1,4,ch);
} else
{if((state_val_11574 === 1))
{var inst_11559 = init;var state_11573__$1 = (function (){var statearr_11582 = state_11573;(statearr_11582[7] = inst_11559);
return statearr_11582;
})();var statearr_11583_11596 = state_11573__$1;(statearr_11583_11596[2] = null);
(statearr_11583_11596[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{return null;
}
}
}
}
}
}
}
});return ((function (switch__6177__auto__){
return (function() {
var state_machine__6178__auto__ = null;
var state_machine__6178__auto____0 = (function (){var statearr_11587 = [null,null,null,null,null,null,null,null,null];(statearr_11587[0] = state_machine__6178__auto__);
(statearr_11587[1] = 1);
return statearr_11587;
});
var state_machine__6178__auto____1 = (function (state_11573){while(true){
var ret_value__6179__auto__ = (function (){try{while(true){
var result__6180__auto__ = switch__6177__auto__.call(null,state_11573);if(cljs.core.keyword_identical_QMARK_.call(null,result__6180__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
continue;
}
} else
{return result__6180__auto__;
}
break;
}
}catch (e11588){if((e11588 instanceof Object))
{var ex__6181__auto__ = e11588;var statearr_11589_11597 = state_11573;(statearr_11589_11597[5] = ex__6181__auto__);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_11573);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if(new cljs.core.Keyword(null,"else","else",1017020587))
{throw e11588;
} else
{return null;
}
}
}})();if(cljs.core.keyword_identical_QMARK_.call(null,ret_value__6179__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
var G__11598 = state_11573;
state_11573 = G__11598;
continue;
}
} else
{return ret_value__6179__auto__;
}
break;
}
});
state_machine__6178__auto__ = function(state_11573){
switch(arguments.length){
case 0:
return state_machine__6178__auto____0.call(this);
case 1:
return state_machine__6178__auto____1.call(this,state_11573);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$0 = state_machine__6178__auto____0;
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$1 = state_machine__6178__auto____1;
return state_machine__6178__auto__;
})()
;})(switch__6177__auto__))
})();var state__6194__auto__ = (function (){var statearr_11590 = f__6193__auto__.call(null);(statearr_11590[cljs.core.async.impl.ioc_helpers.USER_START_IDX] = c__6192__auto__);
return statearr_11590;
})();return cljs.core.async.impl.ioc_helpers.run_state_machine_wrapped.call(null,state__6194__auto__);
}));
return c__6192__auto__;
});
/**
* Puts the contents of coll into the supplied channel.
* 
* By default the channel will be closed after the items are copied,
* but can be determined by the close? parameter.
* 
* Returns a channel which will close after the items are copied.
*/
cljs.core.async.onto_chan = (function() {
var onto_chan = null;
var onto_chan__2 = (function (ch,coll){return onto_chan.call(null,ch,coll,true);
});
var onto_chan__3 = (function (ch,coll,close_QMARK_){var c__6192__auto__ = cljs.core.async.chan.call(null,1);cljs.core.async.impl.dispatch.run.call(null,(function (){var f__6193__auto__ = (function (){var switch__6177__auto__ = (function (state_11660){var state_val_11661 = (state_11660[1]);if((state_val_11661 === 1))
{var inst_11640 = cljs.core.seq.call(null,coll);var inst_11641 = inst_11640;var state_11660__$1 = (function (){var statearr_11662 = state_11660;(statearr_11662[7] = inst_11641);
return statearr_11662;
})();var statearr_11663_11681 = state_11660__$1;(statearr_11663_11681[2] = null);
(statearr_11663_11681[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11661 === 2))
{var inst_11641 = (state_11660[7]);var state_11660__$1 = state_11660;if(cljs.core.truth_(inst_11641))
{var statearr_11664_11682 = state_11660__$1;(statearr_11664_11682[1] = 4);
} else
{var statearr_11665_11683 = state_11660__$1;(statearr_11665_11683[1] = 5);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11661 === 3))
{var inst_11658 = (state_11660[2]);var state_11660__$1 = state_11660;return cljs.core.async.impl.ioc_helpers.return_chan.call(null,state_11660__$1,inst_11658);
} else
{if((state_val_11661 === 4))
{var inst_11641 = (state_11660[7]);var inst_11644 = cljs.core.first.call(null,inst_11641);var state_11660__$1 = state_11660;return cljs.core.async.impl.ioc_helpers.put_BANG_.call(null,state_11660__$1,7,ch,inst_11644);
} else
{if((state_val_11661 === 5))
{var state_11660__$1 = state_11660;if(cljs.core.truth_(close_QMARK_))
{var statearr_11666_11684 = state_11660__$1;(statearr_11666_11684[1] = 8);
} else
{var statearr_11667_11685 = state_11660__$1;(statearr_11667_11685[1] = 9);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11661 === 6))
{var inst_11656 = (state_11660[2]);var state_11660__$1 = state_11660;var statearr_11668_11686 = state_11660__$1;(statearr_11668_11686[2] = inst_11656);
(statearr_11668_11686[1] = 3);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11661 === 7))
{var inst_11641 = (state_11660[7]);var inst_11646 = (state_11660[2]);var inst_11647 = cljs.core.next.call(null,inst_11641);var inst_11641__$1 = inst_11647;var state_11660__$1 = (function (){var statearr_11669 = state_11660;(statearr_11669[8] = inst_11646);
(statearr_11669[7] = inst_11641__$1);
return statearr_11669;
})();var statearr_11670_11687 = state_11660__$1;(statearr_11670_11687[2] = null);
(statearr_11670_11687[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11661 === 8))
{var inst_11651 = cljs.core.async.close_BANG_.call(null,ch);var state_11660__$1 = state_11660;var statearr_11671_11688 = state_11660__$1;(statearr_11671_11688[2] = inst_11651);
(statearr_11671_11688[1] = 10);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11661 === 9))
{var state_11660__$1 = state_11660;var statearr_11672_11689 = state_11660__$1;(statearr_11672_11689[2] = null);
(statearr_11672_11689[1] = 10);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_11661 === 10))
{var inst_11654 = (state_11660[2]);var state_11660__$1 = state_11660;var statearr_11673_11690 = state_11660__$1;(statearr_11673_11690[2] = inst_11654);
(statearr_11673_11690[1] = 6);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{return null;
}
}
}
}
}
}
}
}
}
}
});return ((function (switch__6177__auto__){
return (function() {
var state_machine__6178__auto__ = null;
var state_machine__6178__auto____0 = (function (){var statearr_11677 = [null,null,null,null,null,null,null,null,null];(statearr_11677[0] = state_machine__6178__auto__);
(statearr_11677[1] = 1);
return statearr_11677;
});
var state_machine__6178__auto____1 = (function (state_11660){while(true){
var ret_value__6179__auto__ = (function (){try{while(true){
var result__6180__auto__ = switch__6177__auto__.call(null,state_11660);if(cljs.core.keyword_identical_QMARK_.call(null,result__6180__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
continue;
}
} else
{return result__6180__auto__;
}
break;
}
}catch (e11678){if((e11678 instanceof Object))
{var ex__6181__auto__ = e11678;var statearr_11679_11691 = state_11660;(statearr_11679_11691[5] = ex__6181__auto__);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_11660);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if(new cljs.core.Keyword(null,"else","else",1017020587))
{throw e11678;
} else
{return null;
}
}
}})();if(cljs.core.keyword_identical_QMARK_.call(null,ret_value__6179__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
var G__11692 = state_11660;
state_11660 = G__11692;
continue;
}
} else
{return ret_value__6179__auto__;
}
break;
}
});
state_machine__6178__auto__ = function(state_11660){
switch(arguments.length){
case 0:
return state_machine__6178__auto____0.call(this);
case 1:
return state_machine__6178__auto____1.call(this,state_11660);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$0 = state_machine__6178__auto____0;
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$1 = state_machine__6178__auto____1;
return state_machine__6178__auto__;
})()
;})(switch__6177__auto__))
})();var state__6194__auto__ = (function (){var statearr_11680 = f__6193__auto__.call(null);(statearr_11680[cljs.core.async.impl.ioc_helpers.USER_START_IDX] = c__6192__auto__);
return statearr_11680;
})();return cljs.core.async.impl.ioc_helpers.run_state_machine_wrapped.call(null,state__6194__auto__);
}));
return c__6192__auto__;
});
onto_chan = function(ch,coll,close_QMARK_){
switch(arguments.length){
case 2:
return onto_chan__2.call(this,ch,coll);
case 3:
return onto_chan__3.call(this,ch,coll,close_QMARK_);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
onto_chan.cljs$core$IFn$_invoke$arity$2 = onto_chan__2;
onto_chan.cljs$core$IFn$_invoke$arity$3 = onto_chan__3;
return onto_chan;
})()
;
/**
* Creates and returns a channel which contains the contents of coll,
* closing when exhausted.
*/
cljs.core.async.to_chan = (function to_chan(coll){var ch = cljs.core.async.chan.call(null,cljs.core.bounded_count.call(null,100,coll));cljs.core.async.onto_chan.call(null,ch,coll);
return ch;
});
cljs.core.async.Mux = (function (){var obj11694 = {};return obj11694;
})();
cljs.core.async.muxch_STAR_ = (function muxch_STAR_(_){if((function (){var and__3431__auto__ = _;if(and__3431__auto__)
{return _.cljs$core$async$Mux$muxch_STAR_$arity$1;
} else
{return and__3431__auto__;
}
})())
{return _.cljs$core$async$Mux$muxch_STAR_$arity$1(_);
} else
{var x__4070__auto__ = (((_ == null))?null:_);return (function (){var or__3443__auto__ = (cljs.core.async.muxch_STAR_[goog.typeOf(x__4070__auto__)]);if(or__3443__auto__)
{return or__3443__auto__;
} else
{var or__3443__auto____$1 = (cljs.core.async.muxch_STAR_["_"]);if(or__3443__auto____$1)
{return or__3443__auto____$1;
} else
{throw cljs.core.missing_protocol.call(null,"Mux.muxch*",_);
}
}
})().call(null,_);
}
});
cljs.core.async.Mult = (function (){var obj11696 = {};return obj11696;
})();
cljs.core.async.tap_STAR_ = (function tap_STAR_(m,ch,close_QMARK_){if((function (){var and__3431__auto__ = m;if(and__3431__auto__)
{return m.cljs$core$async$Mult$tap_STAR_$arity$3;
} else
{return and__3431__auto__;
}
})())
{return m.cljs$core$async$Mult$tap_STAR_$arity$3(m,ch,close_QMARK_);
} else
{var x__4070__auto__ = (((m == null))?null:m);return (function (){var or__3443__auto__ = (cljs.core.async.tap_STAR_[goog.typeOf(x__4070__auto__)]);if(or__3443__auto__)
{return or__3443__auto__;
} else
{var or__3443__auto____$1 = (cljs.core.async.tap_STAR_["_"]);if(or__3443__auto____$1)
{return or__3443__auto____$1;
} else
{throw cljs.core.missing_protocol.call(null,"Mult.tap*",m);
}
}
})().call(null,m,ch,close_QMARK_);
}
});
cljs.core.async.untap_STAR_ = (function untap_STAR_(m,ch){if((function (){var and__3431__auto__ = m;if(and__3431__auto__)
{return m.cljs$core$async$Mult$untap_STAR_$arity$2;
} else
{return and__3431__auto__;
}
})())
{return m.cljs$core$async$Mult$untap_STAR_$arity$2(m,ch);
} else
{var x__4070__auto__ = (((m == null))?null:m);return (function (){var or__3443__auto__ = (cljs.core.async.untap_STAR_[goog.typeOf(x__4070__auto__)]);if(or__3443__auto__)
{return or__3443__auto__;
} else
{var or__3443__auto____$1 = (cljs.core.async.untap_STAR_["_"]);if(or__3443__auto____$1)
{return or__3443__auto____$1;
} else
{throw cljs.core.missing_protocol.call(null,"Mult.untap*",m);
}
}
})().call(null,m,ch);
}
});
cljs.core.async.untap_all_STAR_ = (function untap_all_STAR_(m){if((function (){var and__3431__auto__ = m;if(and__3431__auto__)
{return m.cljs$core$async$Mult$untap_all_STAR_$arity$1;
} else
{return and__3431__auto__;
}
})())
{return m.cljs$core$async$Mult$untap_all_STAR_$arity$1(m);
} else
{var x__4070__auto__ = (((m == null))?null:m);return (function (){var or__3443__auto__ = (cljs.core.async.untap_all_STAR_[goog.typeOf(x__4070__auto__)]);if(or__3443__auto__)
{return or__3443__auto__;
} else
{var or__3443__auto____$1 = (cljs.core.async.untap_all_STAR_["_"]);if(or__3443__auto____$1)
{return or__3443__auto____$1;
} else
{throw cljs.core.missing_protocol.call(null,"Mult.untap-all*",m);
}
}
})().call(null,m);
}
});
/**
* Creates and returns a mult(iple) of the supplied channel. Channels
* containing copies of the channel can be created with 'tap', and
* detached with 'untap'.
* 
* Each item is distributed to all taps in parallel and synchronously,
* i.e. each tap must accept before the next item is distributed. Use
* buffering/windowing to prevent slow taps from holding up the mult.
* 
* Items received when there are no taps get dropped.
* 
* If a tap put throws an exception, it will be removed from the mult.
*/
cljs.core.async.mult = (function mult(ch){var cs = cljs.core.atom.call(null,cljs.core.PersistentArrayMap.EMPTY);var m = (function (){if(typeof cljs.core.async.t11920 !== 'undefined')
{} else
{
/**
* @constructor
*/
cljs.core.async.t11920 = (function (cs,ch,mult,meta11921){
this.cs = cs;
this.ch = ch;
this.mult = mult;
this.meta11921 = meta11921;
this.cljs$lang$protocol_mask$partition1$ = 0;
this.cljs$lang$protocol_mask$partition0$ = 393216;
})
cljs.core.async.t11920.cljs$lang$type = true;
cljs.core.async.t11920.cljs$lang$ctorStr = "cljs.core.async/t11920";
cljs.core.async.t11920.cljs$lang$ctorPrWriter = ((function (cs){
return (function (this__4010__auto__,writer__4011__auto__,opt__4012__auto__){return cljs.core._write.call(null,writer__4011__auto__,"cljs.core.async/t11920");
});})(cs))
;
cljs.core.async.t11920.prototype.cljs$core$async$Mult$ = true;
cljs.core.async.t11920.prototype.cljs$core$async$Mult$tap_STAR_$arity$3 = ((function (cs){
return (function (_,ch__$2,close_QMARK_){var self__ = this;
var ___$1 = this;cljs.core.swap_BANG_.call(null,self__.cs,cljs.core.assoc,ch__$2,close_QMARK_);
return null;
});})(cs))
;
cljs.core.async.t11920.prototype.cljs$core$async$Mult$untap_STAR_$arity$2 = ((function (cs){
return (function (_,ch__$2){var self__ = this;
var ___$1 = this;cljs.core.swap_BANG_.call(null,self__.cs,cljs.core.dissoc,ch__$2);
return null;
});})(cs))
;
cljs.core.async.t11920.prototype.cljs$core$async$Mult$untap_all_STAR_$arity$1 = ((function (cs){
return (function (_){var self__ = this;
var ___$1 = this;cljs.core.reset_BANG_.call(null,self__.cs,cljs.core.PersistentArrayMap.EMPTY);
return null;
});})(cs))
;
cljs.core.async.t11920.prototype.cljs$core$async$Mux$ = true;
cljs.core.async.t11920.prototype.cljs$core$async$Mux$muxch_STAR_$arity$1 = ((function (cs){
return (function (_){var self__ = this;
var ___$1 = this;return self__.ch;
});})(cs))
;
cljs.core.async.t11920.prototype.cljs$core$IMeta$_meta$arity$1 = ((function (cs){
return (function (_11922){var self__ = this;
var _11922__$1 = this;return self__.meta11921;
});})(cs))
;
cljs.core.async.t11920.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = ((function (cs){
return (function (_11922,meta11921__$1){var self__ = this;
var _11922__$1 = this;return (new cljs.core.async.t11920(self__.cs,self__.ch,self__.mult,meta11921__$1));
});})(cs))
;
cljs.core.async.__GT_t11920 = ((function (cs){
return (function __GT_t11920(cs__$1,ch__$1,mult__$1,meta11921){return (new cljs.core.async.t11920(cs__$1,ch__$1,mult__$1,meta11921));
});})(cs))
;
}
return (new cljs.core.async.t11920(cs,ch,mult,null));
})();var dchan = cljs.core.async.chan.call(null,1);var dctr = cljs.core.atom.call(null,null);var done = ((function (cs,m,dchan,dctr){
return (function (){if((cljs.core.swap_BANG_.call(null,dctr,cljs.core.dec) === 0))
{return cljs.core.async.put_BANG_.call(null,dchan,true);
} else
{return null;
}
});})(cs,m,dchan,dctr))
;var c__6192__auto___12143 = cljs.core.async.chan.call(null,1);cljs.core.async.impl.dispatch.run.call(null,(function (){var f__6193__auto__ = (function (){var switch__6177__auto__ = (function (state_12057){var state_val_12058 = (state_12057[1]);if((state_val_12058 === 32))
{var inst_12001 = (state_12057[7]);var inst_11925 = (state_12057[8]);var _ = cljs.core.async.impl.ioc_helpers.add_exception_frame.call(null,state_12057,31,Object,null,30);var inst_12008 = cljs.core.async.put_BANG_.call(null,inst_12001,inst_11925,done);var state_12057__$1 = state_12057;var statearr_12059_12144 = state_12057__$1;(statearr_12059_12144[2] = inst_12008);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_12057__$1);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 1))
{var state_12057__$1 = state_12057;var statearr_12060_12145 = state_12057__$1;(statearr_12060_12145[2] = null);
(statearr_12060_12145[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 33))
{var inst_12014 = (state_12057[9]);var inst_12016 = cljs.core.chunked_seq_QMARK_.call(null,inst_12014);var state_12057__$1 = state_12057;if(inst_12016)
{var statearr_12061_12146 = state_12057__$1;(statearr_12061_12146[1] = 36);
} else
{var statearr_12062_12147 = state_12057__$1;(statearr_12062_12147[1] = 37);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 2))
{var state_12057__$1 = state_12057;return cljs.core.async.impl.ioc_helpers.take_BANG_.call(null,state_12057__$1,4,ch);
} else
{if((state_val_12058 === 34))
{var state_12057__$1 = state_12057;var statearr_12063_12148 = state_12057__$1;(statearr_12063_12148[2] = null);
(statearr_12063_12148[1] = 35);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 3))
{var inst_12055 = (state_12057[2]);var state_12057__$1 = state_12057;return cljs.core.async.impl.ioc_helpers.return_chan.call(null,state_12057__$1,inst_12055);
} else
{if((state_val_12058 === 35))
{var inst_12039 = (state_12057[2]);var state_12057__$1 = state_12057;var statearr_12064_12149 = state_12057__$1;(statearr_12064_12149[2] = inst_12039);
(statearr_12064_12149[1] = 29);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 4))
{var inst_11925 = (state_12057[8]);var inst_11925__$1 = (state_12057[2]);var inst_11926 = (inst_11925__$1 == null);var state_12057__$1 = (function (){var statearr_12065 = state_12057;(statearr_12065[8] = inst_11925__$1);
return statearr_12065;
})();if(cljs.core.truth_(inst_11926))
{var statearr_12066_12150 = state_12057__$1;(statearr_12066_12150[1] = 5);
} else
{var statearr_12067_12151 = state_12057__$1;(statearr_12067_12151[1] = 6);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 36))
{var inst_12014 = (state_12057[9]);var inst_12018 = cljs.core.chunk_first.call(null,inst_12014);var inst_12019 = cljs.core.chunk_rest.call(null,inst_12014);var inst_12020 = cljs.core.count.call(null,inst_12018);var inst_11993 = inst_12019;var inst_11994 = inst_12018;var inst_11995 = inst_12020;var inst_11996 = 0;var state_12057__$1 = (function (){var statearr_12068 = state_12057;(statearr_12068[10] = inst_11995);
(statearr_12068[11] = inst_11996);
(statearr_12068[12] = inst_11994);
(statearr_12068[13] = inst_11993);
return statearr_12068;
})();var statearr_12069_12152 = state_12057__$1;(statearr_12069_12152[2] = null);
(statearr_12069_12152[1] = 25);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 5))
{var inst_11932 = cljs.core.deref.call(null,cs);var inst_11933 = cljs.core.seq.call(null,inst_11932);var inst_11934 = inst_11933;var inst_11935 = null;var inst_11936 = 0;var inst_11937 = 0;var state_12057__$1 = (function (){var statearr_12070 = state_12057;(statearr_12070[14] = inst_11934);
(statearr_12070[15] = inst_11936);
(statearr_12070[16] = inst_11935);
(statearr_12070[17] = inst_11937);
return statearr_12070;
})();var statearr_12071_12153 = state_12057__$1;(statearr_12071_12153[2] = null);
(statearr_12071_12153[1] = 8);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 37))
{var inst_12014 = (state_12057[9]);var inst_12023 = cljs.core.first.call(null,inst_12014);var state_12057__$1 = (function (){var statearr_12072 = state_12057;(statearr_12072[18] = inst_12023);
return statearr_12072;
})();var statearr_12073_12154 = state_12057__$1;(statearr_12073_12154[2] = null);
(statearr_12073_12154[1] = 41);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 6))
{var inst_11985 = (state_12057[19]);var inst_11984 = cljs.core.deref.call(null,cs);var inst_11985__$1 = cljs.core.keys.call(null,inst_11984);var inst_11986 = cljs.core.count.call(null,inst_11985__$1);var inst_11987 = cljs.core.reset_BANG_.call(null,dctr,inst_11986);var inst_11992 = cljs.core.seq.call(null,inst_11985__$1);var inst_11993 = inst_11992;var inst_11994 = null;var inst_11995 = 0;var inst_11996 = 0;var state_12057__$1 = (function (){var statearr_12074 = state_12057;(statearr_12074[10] = inst_11995);
(statearr_12074[11] = inst_11996);
(statearr_12074[12] = inst_11994);
(statearr_12074[19] = inst_11985__$1);
(statearr_12074[13] = inst_11993);
(statearr_12074[20] = inst_11987);
return statearr_12074;
})();var statearr_12075_12155 = state_12057__$1;(statearr_12075_12155[2] = null);
(statearr_12075_12155[1] = 25);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 38))
{var inst_12036 = (state_12057[2]);var state_12057__$1 = state_12057;var statearr_12076_12156 = state_12057__$1;(statearr_12076_12156[2] = inst_12036);
(statearr_12076_12156[1] = 35);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 7))
{var inst_12053 = (state_12057[2]);var state_12057__$1 = state_12057;var statearr_12077_12157 = state_12057__$1;(statearr_12077_12157[2] = inst_12053);
(statearr_12077_12157[1] = 3);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 39))
{var inst_12014 = (state_12057[9]);var inst_12032 = (state_12057[2]);var inst_12033 = cljs.core.next.call(null,inst_12014);var inst_11993 = inst_12033;var inst_11994 = null;var inst_11995 = 0;var inst_11996 = 0;var state_12057__$1 = (function (){var statearr_12078 = state_12057;(statearr_12078[21] = inst_12032);
(statearr_12078[10] = inst_11995);
(statearr_12078[11] = inst_11996);
(statearr_12078[12] = inst_11994);
(statearr_12078[13] = inst_11993);
return statearr_12078;
})();var statearr_12079_12158 = state_12057__$1;(statearr_12079_12158[2] = null);
(statearr_12079_12158[1] = 25);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 8))
{var inst_11936 = (state_12057[15]);var inst_11937 = (state_12057[17]);var inst_11939 = (inst_11937 < inst_11936);var inst_11940 = inst_11939;var state_12057__$1 = state_12057;if(cljs.core.truth_(inst_11940))
{var statearr_12080_12159 = state_12057__$1;(statearr_12080_12159[1] = 10);
} else
{var statearr_12081_12160 = state_12057__$1;(statearr_12081_12160[1] = 11);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 40))
{var inst_12023 = (state_12057[18]);var inst_12024 = (state_12057[2]);var inst_12025 = cljs.core.swap_BANG_.call(null,dctr,cljs.core.dec);var inst_12026 = cljs.core.async.untap_STAR_.call(null,m,inst_12023);var state_12057__$1 = (function (){var statearr_12082 = state_12057;(statearr_12082[22] = inst_12025);
(statearr_12082[23] = inst_12024);
return statearr_12082;
})();var statearr_12083_12161 = state_12057__$1;(statearr_12083_12161[2] = inst_12026);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_12057__$1);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 9))
{var inst_11982 = (state_12057[2]);var state_12057__$1 = state_12057;var statearr_12084_12162 = state_12057__$1;(statearr_12084_12162[2] = inst_11982);
(statearr_12084_12162[1] = 7);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 41))
{var inst_12023 = (state_12057[18]);var inst_11925 = (state_12057[8]);var _ = cljs.core.async.impl.ioc_helpers.add_exception_frame.call(null,state_12057,40,Object,null,39);var inst_12030 = cljs.core.async.put_BANG_.call(null,inst_12023,inst_11925,done);var state_12057__$1 = state_12057;var statearr_12085_12163 = state_12057__$1;(statearr_12085_12163[2] = inst_12030);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_12057__$1);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 10))
{var inst_11935 = (state_12057[16]);var inst_11937 = (state_12057[17]);var inst_11943 = cljs.core._nth.call(null,inst_11935,inst_11937);var inst_11944 = cljs.core.nth.call(null,inst_11943,0,null);var inst_11945 = cljs.core.nth.call(null,inst_11943,1,null);var state_12057__$1 = (function (){var statearr_12086 = state_12057;(statearr_12086[24] = inst_11944);
return statearr_12086;
})();if(cljs.core.truth_(inst_11945))
{var statearr_12087_12164 = state_12057__$1;(statearr_12087_12164[1] = 13);
} else
{var statearr_12088_12165 = state_12057__$1;(statearr_12088_12165[1] = 14);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 42))
{var state_12057__$1 = state_12057;return cljs.core.async.impl.ioc_helpers.take_BANG_.call(null,state_12057__$1,45,dchan);
} else
{if((state_val_12058 === 11))
{var inst_11954 = (state_12057[25]);var inst_11934 = (state_12057[14]);var inst_11954__$1 = cljs.core.seq.call(null,inst_11934);var state_12057__$1 = (function (){var statearr_12089 = state_12057;(statearr_12089[25] = inst_11954__$1);
return statearr_12089;
})();if(inst_11954__$1)
{var statearr_12090_12166 = state_12057__$1;(statearr_12090_12166[1] = 16);
} else
{var statearr_12091_12167 = state_12057__$1;(statearr_12091_12167[1] = 17);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 43))
{var state_12057__$1 = state_12057;var statearr_12092_12168 = state_12057__$1;(statearr_12092_12168[2] = null);
(statearr_12092_12168[1] = 44);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 12))
{var inst_11980 = (state_12057[2]);var state_12057__$1 = state_12057;var statearr_12093_12169 = state_12057__$1;(statearr_12093_12169[2] = inst_11980);
(statearr_12093_12169[1] = 9);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 44))
{var inst_12050 = (state_12057[2]);var state_12057__$1 = (function (){var statearr_12094 = state_12057;(statearr_12094[26] = inst_12050);
return statearr_12094;
})();var statearr_12095_12170 = state_12057__$1;(statearr_12095_12170[2] = null);
(statearr_12095_12170[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 13))
{var inst_11944 = (state_12057[24]);var inst_11947 = cljs.core.async.close_BANG_.call(null,inst_11944);var state_12057__$1 = state_12057;var statearr_12096_12171 = state_12057__$1;(statearr_12096_12171[2] = inst_11947);
(statearr_12096_12171[1] = 15);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 45))
{var inst_12047 = (state_12057[2]);var state_12057__$1 = state_12057;var statearr_12100_12172 = state_12057__$1;(statearr_12100_12172[2] = inst_12047);
(statearr_12100_12172[1] = 44);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 14))
{var state_12057__$1 = state_12057;var statearr_12101_12173 = state_12057__$1;(statearr_12101_12173[2] = null);
(statearr_12101_12173[1] = 15);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 15))
{var inst_11934 = (state_12057[14]);var inst_11936 = (state_12057[15]);var inst_11935 = (state_12057[16]);var inst_11937 = (state_12057[17]);var inst_11950 = (state_12057[2]);var inst_11951 = (inst_11937 + 1);var tmp12097 = inst_11934;var tmp12098 = inst_11936;var tmp12099 = inst_11935;var inst_11934__$1 = tmp12097;var inst_11935__$1 = tmp12099;var inst_11936__$1 = tmp12098;var inst_11937__$1 = inst_11951;var state_12057__$1 = (function (){var statearr_12102 = state_12057;(statearr_12102[14] = inst_11934__$1);
(statearr_12102[15] = inst_11936__$1);
(statearr_12102[16] = inst_11935__$1);
(statearr_12102[27] = inst_11950);
(statearr_12102[17] = inst_11937__$1);
return statearr_12102;
})();var statearr_12103_12174 = state_12057__$1;(statearr_12103_12174[2] = null);
(statearr_12103_12174[1] = 8);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 16))
{var inst_11954 = (state_12057[25]);var inst_11956 = cljs.core.chunked_seq_QMARK_.call(null,inst_11954);var state_12057__$1 = state_12057;if(inst_11956)
{var statearr_12104_12175 = state_12057__$1;(statearr_12104_12175[1] = 19);
} else
{var statearr_12105_12176 = state_12057__$1;(statearr_12105_12176[1] = 20);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 17))
{var state_12057__$1 = state_12057;var statearr_12106_12177 = state_12057__$1;(statearr_12106_12177[2] = null);
(statearr_12106_12177[1] = 18);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 18))
{var inst_11978 = (state_12057[2]);var state_12057__$1 = state_12057;var statearr_12107_12178 = state_12057__$1;(statearr_12107_12178[2] = inst_11978);
(statearr_12107_12178[1] = 12);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 19))
{var inst_11954 = (state_12057[25]);var inst_11958 = cljs.core.chunk_first.call(null,inst_11954);var inst_11959 = cljs.core.chunk_rest.call(null,inst_11954);var inst_11960 = cljs.core.count.call(null,inst_11958);var inst_11934 = inst_11959;var inst_11935 = inst_11958;var inst_11936 = inst_11960;var inst_11937 = 0;var state_12057__$1 = (function (){var statearr_12108 = state_12057;(statearr_12108[14] = inst_11934);
(statearr_12108[15] = inst_11936);
(statearr_12108[16] = inst_11935);
(statearr_12108[17] = inst_11937);
return statearr_12108;
})();var statearr_12109_12179 = state_12057__$1;(statearr_12109_12179[2] = null);
(statearr_12109_12179[1] = 8);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 20))
{var inst_11954 = (state_12057[25]);var inst_11964 = cljs.core.first.call(null,inst_11954);var inst_11965 = cljs.core.nth.call(null,inst_11964,0,null);var inst_11966 = cljs.core.nth.call(null,inst_11964,1,null);var state_12057__$1 = (function (){var statearr_12110 = state_12057;(statearr_12110[28] = inst_11965);
return statearr_12110;
})();if(cljs.core.truth_(inst_11966))
{var statearr_12111_12180 = state_12057__$1;(statearr_12111_12180[1] = 22);
} else
{var statearr_12112_12181 = state_12057__$1;(statearr_12112_12181[1] = 23);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 21))
{var inst_11975 = (state_12057[2]);var state_12057__$1 = state_12057;var statearr_12113_12182 = state_12057__$1;(statearr_12113_12182[2] = inst_11975);
(statearr_12113_12182[1] = 18);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 22))
{var inst_11965 = (state_12057[28]);var inst_11968 = cljs.core.async.close_BANG_.call(null,inst_11965);var state_12057__$1 = state_12057;var statearr_12114_12183 = state_12057__$1;(statearr_12114_12183[2] = inst_11968);
(statearr_12114_12183[1] = 24);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 23))
{var state_12057__$1 = state_12057;var statearr_12115_12184 = state_12057__$1;(statearr_12115_12184[2] = null);
(statearr_12115_12184[1] = 24);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 24))
{var inst_11954 = (state_12057[25]);var inst_11971 = (state_12057[2]);var inst_11972 = cljs.core.next.call(null,inst_11954);var inst_11934 = inst_11972;var inst_11935 = null;var inst_11936 = 0;var inst_11937 = 0;var state_12057__$1 = (function (){var statearr_12116 = state_12057;(statearr_12116[29] = inst_11971);
(statearr_12116[14] = inst_11934);
(statearr_12116[15] = inst_11936);
(statearr_12116[16] = inst_11935);
(statearr_12116[17] = inst_11937);
return statearr_12116;
})();var statearr_12117_12185 = state_12057__$1;(statearr_12117_12185[2] = null);
(statearr_12117_12185[1] = 8);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 25))
{var inst_11995 = (state_12057[10]);var inst_11996 = (state_12057[11]);var inst_11998 = (inst_11996 < inst_11995);var inst_11999 = inst_11998;var state_12057__$1 = state_12057;if(cljs.core.truth_(inst_11999))
{var statearr_12118_12186 = state_12057__$1;(statearr_12118_12186[1] = 27);
} else
{var statearr_12119_12187 = state_12057__$1;(statearr_12119_12187[1] = 28);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 26))
{var inst_11985 = (state_12057[19]);var inst_12043 = (state_12057[2]);var inst_12044 = cljs.core.seq.call(null,inst_11985);var state_12057__$1 = (function (){var statearr_12120 = state_12057;(statearr_12120[30] = inst_12043);
return statearr_12120;
})();if(inst_12044)
{var statearr_12121_12188 = state_12057__$1;(statearr_12121_12188[1] = 42);
} else
{var statearr_12122_12189 = state_12057__$1;(statearr_12122_12189[1] = 43);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 27))
{var inst_11996 = (state_12057[11]);var inst_11994 = (state_12057[12]);var inst_12001 = cljs.core._nth.call(null,inst_11994,inst_11996);var state_12057__$1 = (function (){var statearr_12123 = state_12057;(statearr_12123[7] = inst_12001);
return statearr_12123;
})();var statearr_12124_12190 = state_12057__$1;(statearr_12124_12190[2] = null);
(statearr_12124_12190[1] = 32);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 28))
{var inst_12014 = (state_12057[9]);var inst_11993 = (state_12057[13]);var inst_12014__$1 = cljs.core.seq.call(null,inst_11993);var state_12057__$1 = (function (){var statearr_12128 = state_12057;(statearr_12128[9] = inst_12014__$1);
return statearr_12128;
})();if(inst_12014__$1)
{var statearr_12129_12191 = state_12057__$1;(statearr_12129_12191[1] = 33);
} else
{var statearr_12130_12192 = state_12057__$1;(statearr_12130_12192[1] = 34);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 29))
{var inst_12041 = (state_12057[2]);var state_12057__$1 = state_12057;var statearr_12131_12193 = state_12057__$1;(statearr_12131_12193[2] = inst_12041);
(statearr_12131_12193[1] = 26);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 30))
{var inst_11995 = (state_12057[10]);var inst_11996 = (state_12057[11]);var inst_11994 = (state_12057[12]);var inst_11993 = (state_12057[13]);var inst_12010 = (state_12057[2]);var inst_12011 = (inst_11996 + 1);var tmp12125 = inst_11995;var tmp12126 = inst_11994;var tmp12127 = inst_11993;var inst_11993__$1 = tmp12127;var inst_11994__$1 = tmp12126;var inst_11995__$1 = tmp12125;var inst_11996__$1 = inst_12011;var state_12057__$1 = (function (){var statearr_12132 = state_12057;(statearr_12132[10] = inst_11995__$1);
(statearr_12132[11] = inst_11996__$1);
(statearr_12132[31] = inst_12010);
(statearr_12132[12] = inst_11994__$1);
(statearr_12132[13] = inst_11993__$1);
return statearr_12132;
})();var statearr_12133_12194 = state_12057__$1;(statearr_12133_12194[2] = null);
(statearr_12133_12194[1] = 25);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12058 === 31))
{var inst_12001 = (state_12057[7]);var inst_12002 = (state_12057[2]);var inst_12003 = cljs.core.swap_BANG_.call(null,dctr,cljs.core.dec);var inst_12004 = cljs.core.async.untap_STAR_.call(null,m,inst_12001);var state_12057__$1 = (function (){var statearr_12134 = state_12057;(statearr_12134[32] = inst_12003);
(statearr_12134[33] = inst_12002);
return statearr_12134;
})();var statearr_12135_12195 = state_12057__$1;(statearr_12135_12195[2] = inst_12004);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_12057__$1);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{return null;
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
});return ((function (switch__6177__auto__){
return (function() {
var state_machine__6178__auto__ = null;
var state_machine__6178__auto____0 = (function (){var statearr_12139 = [null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null];(statearr_12139[0] = state_machine__6178__auto__);
(statearr_12139[1] = 1);
return statearr_12139;
});
var state_machine__6178__auto____1 = (function (state_12057){while(true){
var ret_value__6179__auto__ = (function (){try{while(true){
var result__6180__auto__ = switch__6177__auto__.call(null,state_12057);if(cljs.core.keyword_identical_QMARK_.call(null,result__6180__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
continue;
}
} else
{return result__6180__auto__;
}
break;
}
}catch (e12140){if((e12140 instanceof Object))
{var ex__6181__auto__ = e12140;var statearr_12141_12196 = state_12057;(statearr_12141_12196[5] = ex__6181__auto__);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_12057);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if(new cljs.core.Keyword(null,"else","else",1017020587))
{throw e12140;
} else
{return null;
}
}
}})();if(cljs.core.keyword_identical_QMARK_.call(null,ret_value__6179__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
var G__12197 = state_12057;
state_12057 = G__12197;
continue;
}
} else
{return ret_value__6179__auto__;
}
break;
}
});
state_machine__6178__auto__ = function(state_12057){
switch(arguments.length){
case 0:
return state_machine__6178__auto____0.call(this);
case 1:
return state_machine__6178__auto____1.call(this,state_12057);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$0 = state_machine__6178__auto____0;
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$1 = state_machine__6178__auto____1;
return state_machine__6178__auto__;
})()
;})(switch__6177__auto__))
})();var state__6194__auto__ = (function (){var statearr_12142 = f__6193__auto__.call(null);(statearr_12142[cljs.core.async.impl.ioc_helpers.USER_START_IDX] = c__6192__auto___12143);
return statearr_12142;
})();return cljs.core.async.impl.ioc_helpers.run_state_machine_wrapped.call(null,state__6194__auto__);
}));
return m;
});
/**
* Copies the mult source onto the supplied channel.
* 
* By default the channel will be closed when the source closes,
* but can be determined by the close? parameter.
*/
cljs.core.async.tap = (function() {
var tap = null;
var tap__2 = (function (mult,ch){return tap.call(null,mult,ch,true);
});
var tap__3 = (function (mult,ch,close_QMARK_){cljs.core.async.tap_STAR_.call(null,mult,ch,close_QMARK_);
return ch;
});
tap = function(mult,ch,close_QMARK_){
switch(arguments.length){
case 2:
return tap__2.call(this,mult,ch);
case 3:
return tap__3.call(this,mult,ch,close_QMARK_);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
tap.cljs$core$IFn$_invoke$arity$2 = tap__2;
tap.cljs$core$IFn$_invoke$arity$3 = tap__3;
return tap;
})()
;
/**
* Disconnects a target channel from a mult
*/
cljs.core.async.untap = (function untap(mult,ch){return cljs.core.async.untap_STAR_.call(null,mult,ch);
});
/**
* Disconnects all target channels from a mult
*/
cljs.core.async.untap_all = (function untap_all(mult){return cljs.core.async.untap_all_STAR_.call(null,mult);
});
cljs.core.async.Mix = (function (){var obj12199 = {};return obj12199;
})();
cljs.core.async.admix_STAR_ = (function admix_STAR_(m,ch){if((function (){var and__3431__auto__ = m;if(and__3431__auto__)
{return m.cljs$core$async$Mix$admix_STAR_$arity$2;
} else
{return and__3431__auto__;
}
})())
{return m.cljs$core$async$Mix$admix_STAR_$arity$2(m,ch);
} else
{var x__4070__auto__ = (((m == null))?null:m);return (function (){var or__3443__auto__ = (cljs.core.async.admix_STAR_[goog.typeOf(x__4070__auto__)]);if(or__3443__auto__)
{return or__3443__auto__;
} else
{var or__3443__auto____$1 = (cljs.core.async.admix_STAR_["_"]);if(or__3443__auto____$1)
{return or__3443__auto____$1;
} else
{throw cljs.core.missing_protocol.call(null,"Mix.admix*",m);
}
}
})().call(null,m,ch);
}
});
cljs.core.async.unmix_STAR_ = (function unmix_STAR_(m,ch){if((function (){var and__3431__auto__ = m;if(and__3431__auto__)
{return m.cljs$core$async$Mix$unmix_STAR_$arity$2;
} else
{return and__3431__auto__;
}
})())
{return m.cljs$core$async$Mix$unmix_STAR_$arity$2(m,ch);
} else
{var x__4070__auto__ = (((m == null))?null:m);return (function (){var or__3443__auto__ = (cljs.core.async.unmix_STAR_[goog.typeOf(x__4070__auto__)]);if(or__3443__auto__)
{return or__3443__auto__;
} else
{var or__3443__auto____$1 = (cljs.core.async.unmix_STAR_["_"]);if(or__3443__auto____$1)
{return or__3443__auto____$1;
} else
{throw cljs.core.missing_protocol.call(null,"Mix.unmix*",m);
}
}
})().call(null,m,ch);
}
});
cljs.core.async.unmix_all_STAR_ = (function unmix_all_STAR_(m){if((function (){var and__3431__auto__ = m;if(and__3431__auto__)
{return m.cljs$core$async$Mix$unmix_all_STAR_$arity$1;
} else
{return and__3431__auto__;
}
})())
{return m.cljs$core$async$Mix$unmix_all_STAR_$arity$1(m);
} else
{var x__4070__auto__ = (((m == null))?null:m);return (function (){var or__3443__auto__ = (cljs.core.async.unmix_all_STAR_[goog.typeOf(x__4070__auto__)]);if(or__3443__auto__)
{return or__3443__auto__;
} else
{var or__3443__auto____$1 = (cljs.core.async.unmix_all_STAR_["_"]);if(or__3443__auto____$1)
{return or__3443__auto____$1;
} else
{throw cljs.core.missing_protocol.call(null,"Mix.unmix-all*",m);
}
}
})().call(null,m);
}
});
cljs.core.async.toggle_STAR_ = (function toggle_STAR_(m,state_map){if((function (){var and__3431__auto__ = m;if(and__3431__auto__)
{return m.cljs$core$async$Mix$toggle_STAR_$arity$2;
} else
{return and__3431__auto__;
}
})())
{return m.cljs$core$async$Mix$toggle_STAR_$arity$2(m,state_map);
} else
{var x__4070__auto__ = (((m == null))?null:m);return (function (){var or__3443__auto__ = (cljs.core.async.toggle_STAR_[goog.typeOf(x__4070__auto__)]);if(or__3443__auto__)
{return or__3443__auto__;
} else
{var or__3443__auto____$1 = (cljs.core.async.toggle_STAR_["_"]);if(or__3443__auto____$1)
{return or__3443__auto____$1;
} else
{throw cljs.core.missing_protocol.call(null,"Mix.toggle*",m);
}
}
})().call(null,m,state_map);
}
});
cljs.core.async.solo_mode_STAR_ = (function solo_mode_STAR_(m,mode){if((function (){var and__3431__auto__ = m;if(and__3431__auto__)
{return m.cljs$core$async$Mix$solo_mode_STAR_$arity$2;
} else
{return and__3431__auto__;
}
})())
{return m.cljs$core$async$Mix$solo_mode_STAR_$arity$2(m,mode);
} else
{var x__4070__auto__ = (((m == null))?null:m);return (function (){var or__3443__auto__ = (cljs.core.async.solo_mode_STAR_[goog.typeOf(x__4070__auto__)]);if(or__3443__auto__)
{return or__3443__auto__;
} else
{var or__3443__auto____$1 = (cljs.core.async.solo_mode_STAR_["_"]);if(or__3443__auto____$1)
{return or__3443__auto____$1;
} else
{throw cljs.core.missing_protocol.call(null,"Mix.solo-mode*",m);
}
}
})().call(null,m,mode);
}
});
/**
* Creates and returns a mix of one or more input channels which will
* be put on the supplied out channel. Input sources can be added to
* the mix with 'admix', and removed with 'unmix'. A mix supports
* soloing, muting and pausing multiple inputs atomically using
* 'toggle', and can solo using either muting or pausing as determined
* by 'solo-mode'.
* 
* Each channel can have zero or more boolean modes set via 'toggle':
* 
* :solo - when true, only this (ond other soloed) channel(s) will appear
* in the mix output channel. :mute and :pause states of soloed
* channels are ignored. If solo-mode is :mute, non-soloed
* channels are muted, if :pause, non-soloed channels are
* paused.
* 
* :mute - muted channels will have their contents consumed but not included in the mix
* :pause - paused channels will not have their contents consumed (and thus also not included in the mix)
*/
cljs.core.async.mix = (function mix(out){var cs = cljs.core.atom.call(null,cljs.core.PersistentArrayMap.EMPTY);var solo_modes = new cljs.core.PersistentHashSet(null, new cljs.core.PersistentArrayMap(null, 2, [new cljs.core.Keyword(null,"pause","pause",1120344424),null,new cljs.core.Keyword(null,"mute","mute",1017267595),null], null), null);var attrs = cljs.core.conj.call(null,solo_modes,new cljs.core.Keyword(null,"solo","solo",1017440337));var solo_mode = cljs.core.atom.call(null,new cljs.core.Keyword(null,"mute","mute",1017267595));var change = cljs.core.async.chan.call(null);var changed = ((function (cs,solo_modes,attrs,solo_mode,change){
return (function (){return cljs.core.async.put_BANG_.call(null,change,true);
});})(cs,solo_modes,attrs,solo_mode,change))
;var pick = ((function (cs,solo_modes,attrs,solo_mode,change,changed){
return (function (attr,chs){return cljs.core.reduce_kv.call(null,((function (cs,solo_modes,attrs,solo_mode,change,changed){
return (function (ret,c,v){if(cljs.core.truth_(attr.call(null,v)))
{return cljs.core.conj.call(null,ret,c);
} else
{return ret;
}
});})(cs,solo_modes,attrs,solo_mode,change,changed))
,cljs.core.PersistentHashSet.EMPTY,chs);
});})(cs,solo_modes,attrs,solo_mode,change,changed))
;var calc_state = ((function (cs,solo_modes,attrs,solo_mode,change,changed,pick){
return (function (){var chs = cljs.core.deref.call(null,cs);var mode = cljs.core.deref.call(null,solo_mode);var solos = pick.call(null,new cljs.core.Keyword(null,"solo","solo",1017440337),chs);var pauses = pick.call(null,new cljs.core.Keyword(null,"pause","pause",1120344424),chs);return new cljs.core.PersistentArrayMap(null, 3, [new cljs.core.Keyword(null,"solos","solos",1123523302),solos,new cljs.core.Keyword(null,"mutes","mutes",1118168300),pick.call(null,new cljs.core.Keyword(null,"mute","mute",1017267595),chs),new cljs.core.Keyword(null,"reads","reads",1122290959),cljs.core.conj.call(null,(((cljs.core._EQ_.call(null,mode,new cljs.core.Keyword(null,"pause","pause",1120344424))) && (!(cljs.core.empty_QMARK_.call(null,solos))))?cljs.core.vec.call(null,solos):cljs.core.vec.call(null,cljs.core.remove.call(null,pauses,cljs.core.keys.call(null,chs)))),change)], null);
});})(cs,solo_modes,attrs,solo_mode,change,changed,pick))
;var m = (function (){if(typeof cljs.core.async.t12309 !== 'undefined')
{} else
{
/**
* @constructor
*/
cljs.core.async.t12309 = (function (pick,out,attrs,cs,calc_state,solo_modes,mix,changed,change,solo_mode,meta12310){
this.pick = pick;
this.out = out;
this.attrs = attrs;
this.cs = cs;
this.calc_state = calc_state;
this.solo_modes = solo_modes;
this.mix = mix;
this.changed = changed;
this.change = change;
this.solo_mode = solo_mode;
this.meta12310 = meta12310;
this.cljs$lang$protocol_mask$partition1$ = 0;
this.cljs$lang$protocol_mask$partition0$ = 393216;
})
cljs.core.async.t12309.cljs$lang$type = true;
cljs.core.async.t12309.cljs$lang$ctorStr = "cljs.core.async/t12309";
cljs.core.async.t12309.cljs$lang$ctorPrWriter = ((function (cs,solo_modes,attrs,solo_mode,change,changed,pick,calc_state){
return (function (this__4010__auto__,writer__4011__auto__,opt__4012__auto__){return cljs.core._write.call(null,writer__4011__auto__,"cljs.core.async/t12309");
});})(cs,solo_modes,attrs,solo_mode,change,changed,pick,calc_state))
;
cljs.core.async.t12309.prototype.cljs$core$async$Mix$ = true;
cljs.core.async.t12309.prototype.cljs$core$async$Mix$admix_STAR_$arity$2 = ((function (cs,solo_modes,attrs,solo_mode,change,changed,pick,calc_state){
return (function (_,ch){var self__ = this;
var ___$1 = this;cljs.core.swap_BANG_.call(null,self__.cs,cljs.core.assoc,ch,cljs.core.PersistentArrayMap.EMPTY);
return self__.changed.call(null);
});})(cs,solo_modes,attrs,solo_mode,change,changed,pick,calc_state))
;
cljs.core.async.t12309.prototype.cljs$core$async$Mix$unmix_STAR_$arity$2 = ((function (cs,solo_modes,attrs,solo_mode,change,changed,pick,calc_state){
return (function (_,ch){var self__ = this;
var ___$1 = this;cljs.core.swap_BANG_.call(null,self__.cs,cljs.core.dissoc,ch);
return self__.changed.call(null);
});})(cs,solo_modes,attrs,solo_mode,change,changed,pick,calc_state))
;
cljs.core.async.t12309.prototype.cljs$core$async$Mix$unmix_all_STAR_$arity$1 = ((function (cs,solo_modes,attrs,solo_mode,change,changed,pick,calc_state){
return (function (_){var self__ = this;
var ___$1 = this;cljs.core.reset_BANG_.call(null,self__.cs,cljs.core.PersistentArrayMap.EMPTY);
return self__.changed.call(null);
});})(cs,solo_modes,attrs,solo_mode,change,changed,pick,calc_state))
;
cljs.core.async.t12309.prototype.cljs$core$async$Mix$toggle_STAR_$arity$2 = ((function (cs,solo_modes,attrs,solo_mode,change,changed,pick,calc_state){
return (function (_,state_map){var self__ = this;
var ___$1 = this;cljs.core.swap_BANG_.call(null,self__.cs,cljs.core.partial.call(null,cljs.core.merge_with,cljs.core.merge),state_map);
return self__.changed.call(null);
});})(cs,solo_modes,attrs,solo_mode,change,changed,pick,calc_state))
;
cljs.core.async.t12309.prototype.cljs$core$async$Mix$solo_mode_STAR_$arity$2 = ((function (cs,solo_modes,attrs,solo_mode,change,changed,pick,calc_state){
return (function (_,mode){var self__ = this;
var ___$1 = this;if(cljs.core.truth_(self__.solo_modes.call(null,mode)))
{} else
{throw (new Error([cljs.core.str("Assert failed: "),cljs.core.str([cljs.core.str("mode must be one of: "),cljs.core.str(self__.solo_modes)].join('')),cljs.core.str("\n"),cljs.core.str(cljs.core.pr_str.call(null,cljs.core.list(new cljs.core.Symbol(null,"solo-modes","solo-modes",-1162732933,null),new cljs.core.Symbol(null,"mode","mode",-1637174436,null))))].join('')));
}
cljs.core.reset_BANG_.call(null,self__.solo_mode,mode);
return self__.changed.call(null);
});})(cs,solo_modes,attrs,solo_mode,change,changed,pick,calc_state))
;
cljs.core.async.t12309.prototype.cljs$core$async$Mux$ = true;
cljs.core.async.t12309.prototype.cljs$core$async$Mux$muxch_STAR_$arity$1 = ((function (cs,solo_modes,attrs,solo_mode,change,changed,pick,calc_state){
return (function (_){var self__ = this;
var ___$1 = this;return self__.out;
});})(cs,solo_modes,attrs,solo_mode,change,changed,pick,calc_state))
;
cljs.core.async.t12309.prototype.cljs$core$IMeta$_meta$arity$1 = ((function (cs,solo_modes,attrs,solo_mode,change,changed,pick,calc_state){
return (function (_12311){var self__ = this;
var _12311__$1 = this;return self__.meta12310;
});})(cs,solo_modes,attrs,solo_mode,change,changed,pick,calc_state))
;
cljs.core.async.t12309.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = ((function (cs,solo_modes,attrs,solo_mode,change,changed,pick,calc_state){
return (function (_12311,meta12310__$1){var self__ = this;
var _12311__$1 = this;return (new cljs.core.async.t12309(self__.pick,self__.out,self__.attrs,self__.cs,self__.calc_state,self__.solo_modes,self__.mix,self__.changed,self__.change,self__.solo_mode,meta12310__$1));
});})(cs,solo_modes,attrs,solo_mode,change,changed,pick,calc_state))
;
cljs.core.async.__GT_t12309 = ((function (cs,solo_modes,attrs,solo_mode,change,changed,pick,calc_state){
return (function __GT_t12309(pick__$1,out__$1,attrs__$1,cs__$1,calc_state__$1,solo_modes__$1,mix__$1,changed__$1,change__$1,solo_mode__$1,meta12310){return (new cljs.core.async.t12309(pick__$1,out__$1,attrs__$1,cs__$1,calc_state__$1,solo_modes__$1,mix__$1,changed__$1,change__$1,solo_mode__$1,meta12310));
});})(cs,solo_modes,attrs,solo_mode,change,changed,pick,calc_state))
;
}
return (new cljs.core.async.t12309(pick,out,attrs,cs,calc_state,solo_modes,mix,changed,change,solo_mode,null));
})();var c__6192__auto___12418 = cljs.core.async.chan.call(null,1);cljs.core.async.impl.dispatch.run.call(null,(function (){var f__6193__auto__ = (function (){var switch__6177__auto__ = (function (state_12376){var state_val_12377 = (state_12376[1]);if((state_val_12377 === 1))
{var inst_12315 = (state_12376[7]);var inst_12315__$1 = calc_state.call(null);var inst_12316 = cljs.core.seq_QMARK_.call(null,inst_12315__$1);var state_12376__$1 = (function (){var statearr_12378 = state_12376;(statearr_12378[7] = inst_12315__$1);
return statearr_12378;
})();if(inst_12316)
{var statearr_12379_12419 = state_12376__$1;(statearr_12379_12419[1] = 2);
} else
{var statearr_12380_12420 = state_12376__$1;(statearr_12380_12420[1] = 3);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12377 === 2))
{var inst_12315 = (state_12376[7]);var inst_12318 = cljs.core.apply.call(null,cljs.core.hash_map,inst_12315);var state_12376__$1 = state_12376;var statearr_12381_12421 = state_12376__$1;(statearr_12381_12421[2] = inst_12318);
(statearr_12381_12421[1] = 4);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12377 === 3))
{var inst_12315 = (state_12376[7]);var state_12376__$1 = state_12376;var statearr_12382_12422 = state_12376__$1;(statearr_12382_12422[2] = inst_12315);
(statearr_12382_12422[1] = 4);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12377 === 4))
{var inst_12315 = (state_12376[7]);var inst_12321 = (state_12376[2]);var inst_12322 = cljs.core.get.call(null,inst_12321,new cljs.core.Keyword(null,"reads","reads",1122290959));var inst_12323 = cljs.core.get.call(null,inst_12321,new cljs.core.Keyword(null,"mutes","mutes",1118168300));var inst_12324 = cljs.core.get.call(null,inst_12321,new cljs.core.Keyword(null,"solos","solos",1123523302));var inst_12325 = inst_12315;var state_12376__$1 = (function (){var statearr_12383 = state_12376;(statearr_12383[8] = inst_12325);
(statearr_12383[9] = inst_12324);
(statearr_12383[10] = inst_12323);
(statearr_12383[11] = inst_12322);
return statearr_12383;
})();var statearr_12384_12423 = state_12376__$1;(statearr_12384_12423[2] = null);
(statearr_12384_12423[1] = 5);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12377 === 5))
{var inst_12325 = (state_12376[8]);var inst_12328 = cljs.core.seq_QMARK_.call(null,inst_12325);var state_12376__$1 = state_12376;if(inst_12328)
{var statearr_12385_12424 = state_12376__$1;(statearr_12385_12424[1] = 7);
} else
{var statearr_12386_12425 = state_12376__$1;(statearr_12386_12425[1] = 8);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12377 === 6))
{var inst_12374 = (state_12376[2]);var state_12376__$1 = state_12376;return cljs.core.async.impl.ioc_helpers.return_chan.call(null,state_12376__$1,inst_12374);
} else
{if((state_val_12377 === 7))
{var inst_12325 = (state_12376[8]);var inst_12330 = cljs.core.apply.call(null,cljs.core.hash_map,inst_12325);var state_12376__$1 = state_12376;var statearr_12387_12426 = state_12376__$1;(statearr_12387_12426[2] = inst_12330);
(statearr_12387_12426[1] = 9);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12377 === 8))
{var inst_12325 = (state_12376[8]);var state_12376__$1 = state_12376;var statearr_12388_12427 = state_12376__$1;(statearr_12388_12427[2] = inst_12325);
(statearr_12388_12427[1] = 9);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12377 === 9))
{var inst_12333 = (state_12376[12]);var inst_12333__$1 = (state_12376[2]);var inst_12334 = cljs.core.get.call(null,inst_12333__$1,new cljs.core.Keyword(null,"reads","reads",1122290959));var inst_12335 = cljs.core.get.call(null,inst_12333__$1,new cljs.core.Keyword(null,"mutes","mutes",1118168300));var inst_12336 = cljs.core.get.call(null,inst_12333__$1,new cljs.core.Keyword(null,"solos","solos",1123523302));var state_12376__$1 = (function (){var statearr_12389 = state_12376;(statearr_12389[13] = inst_12336);
(statearr_12389[14] = inst_12335);
(statearr_12389[12] = inst_12333__$1);
return statearr_12389;
})();return cljs.core.async.impl.ioc_helpers.ioc_alts_BANG_.call(null,state_12376__$1,10,inst_12334);
} else
{if((state_val_12377 === 10))
{var inst_12341 = (state_12376[15]);var inst_12340 = (state_12376[16]);var inst_12339 = (state_12376[2]);var inst_12340__$1 = cljs.core.nth.call(null,inst_12339,0,null);var inst_12341__$1 = cljs.core.nth.call(null,inst_12339,1,null);var inst_12342 = (inst_12340__$1 == null);var inst_12343 = cljs.core._EQ_.call(null,inst_12341__$1,change);var inst_12344 = (inst_12342) || (inst_12343);var state_12376__$1 = (function (){var statearr_12390 = state_12376;(statearr_12390[15] = inst_12341__$1);
(statearr_12390[16] = inst_12340__$1);
return statearr_12390;
})();if(cljs.core.truth_(inst_12344))
{var statearr_12391_12428 = state_12376__$1;(statearr_12391_12428[1] = 11);
} else
{var statearr_12392_12429 = state_12376__$1;(statearr_12392_12429[1] = 12);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12377 === 11))
{var inst_12340 = (state_12376[16]);var inst_12346 = (inst_12340 == null);var state_12376__$1 = state_12376;if(cljs.core.truth_(inst_12346))
{var statearr_12393_12430 = state_12376__$1;(statearr_12393_12430[1] = 14);
} else
{var statearr_12394_12431 = state_12376__$1;(statearr_12394_12431[1] = 15);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12377 === 12))
{var inst_12341 = (state_12376[15]);var inst_12355 = (state_12376[17]);var inst_12336 = (state_12376[13]);var inst_12355__$1 = inst_12336.call(null,inst_12341);var state_12376__$1 = (function (){var statearr_12395 = state_12376;(statearr_12395[17] = inst_12355__$1);
return statearr_12395;
})();if(cljs.core.truth_(inst_12355__$1))
{var statearr_12396_12432 = state_12376__$1;(statearr_12396_12432[1] = 17);
} else
{var statearr_12397_12433 = state_12376__$1;(statearr_12397_12433[1] = 18);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12377 === 13))
{var inst_12372 = (state_12376[2]);var state_12376__$1 = state_12376;var statearr_12398_12434 = state_12376__$1;(statearr_12398_12434[2] = inst_12372);
(statearr_12398_12434[1] = 6);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12377 === 14))
{var inst_12341 = (state_12376[15]);var inst_12348 = cljs.core.swap_BANG_.call(null,cs,cljs.core.dissoc,inst_12341);var state_12376__$1 = state_12376;var statearr_12399_12435 = state_12376__$1;(statearr_12399_12435[2] = inst_12348);
(statearr_12399_12435[1] = 16);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12377 === 15))
{var state_12376__$1 = state_12376;var statearr_12400_12436 = state_12376__$1;(statearr_12400_12436[2] = null);
(statearr_12400_12436[1] = 16);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12377 === 16))
{var inst_12351 = (state_12376[2]);var inst_12352 = calc_state.call(null);var inst_12325 = inst_12352;var state_12376__$1 = (function (){var statearr_12401 = state_12376;(statearr_12401[18] = inst_12351);
(statearr_12401[8] = inst_12325);
return statearr_12401;
})();var statearr_12402_12437 = state_12376__$1;(statearr_12402_12437[2] = null);
(statearr_12402_12437[1] = 5);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12377 === 17))
{var inst_12355 = (state_12376[17]);var state_12376__$1 = state_12376;var statearr_12403_12438 = state_12376__$1;(statearr_12403_12438[2] = inst_12355);
(statearr_12403_12438[1] = 19);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12377 === 18))
{var inst_12341 = (state_12376[15]);var inst_12336 = (state_12376[13]);var inst_12335 = (state_12376[14]);var inst_12358 = cljs.core.empty_QMARK_.call(null,inst_12336);var inst_12359 = inst_12335.call(null,inst_12341);var inst_12360 = cljs.core.not.call(null,inst_12359);var inst_12361 = (inst_12358) && (inst_12360);var state_12376__$1 = state_12376;var statearr_12404_12439 = state_12376__$1;(statearr_12404_12439[2] = inst_12361);
(statearr_12404_12439[1] = 19);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12377 === 19))
{var inst_12363 = (state_12376[2]);var state_12376__$1 = state_12376;if(cljs.core.truth_(inst_12363))
{var statearr_12405_12440 = state_12376__$1;(statearr_12405_12440[1] = 20);
} else
{var statearr_12406_12441 = state_12376__$1;(statearr_12406_12441[1] = 21);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12377 === 20))
{var inst_12340 = (state_12376[16]);var state_12376__$1 = state_12376;return cljs.core.async.impl.ioc_helpers.put_BANG_.call(null,state_12376__$1,23,out,inst_12340);
} else
{if((state_val_12377 === 21))
{var state_12376__$1 = state_12376;var statearr_12407_12442 = state_12376__$1;(statearr_12407_12442[2] = null);
(statearr_12407_12442[1] = 22);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12377 === 22))
{var inst_12333 = (state_12376[12]);var inst_12369 = (state_12376[2]);var inst_12325 = inst_12333;var state_12376__$1 = (function (){var statearr_12408 = state_12376;(statearr_12408[19] = inst_12369);
(statearr_12408[8] = inst_12325);
return statearr_12408;
})();var statearr_12409_12443 = state_12376__$1;(statearr_12409_12443[2] = null);
(statearr_12409_12443[1] = 5);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12377 === 23))
{var inst_12366 = (state_12376[2]);var state_12376__$1 = state_12376;var statearr_12410_12444 = state_12376__$1;(statearr_12410_12444[2] = inst_12366);
(statearr_12410_12444[1] = 22);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{return null;
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
});return ((function (switch__6177__auto__){
return (function() {
var state_machine__6178__auto__ = null;
var state_machine__6178__auto____0 = (function (){var statearr_12414 = [null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null];(statearr_12414[0] = state_machine__6178__auto__);
(statearr_12414[1] = 1);
return statearr_12414;
});
var state_machine__6178__auto____1 = (function (state_12376){while(true){
var ret_value__6179__auto__ = (function (){try{while(true){
var result__6180__auto__ = switch__6177__auto__.call(null,state_12376);if(cljs.core.keyword_identical_QMARK_.call(null,result__6180__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
continue;
}
} else
{return result__6180__auto__;
}
break;
}
}catch (e12415){if((e12415 instanceof Object))
{var ex__6181__auto__ = e12415;var statearr_12416_12445 = state_12376;(statearr_12416_12445[5] = ex__6181__auto__);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_12376);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if(new cljs.core.Keyword(null,"else","else",1017020587))
{throw e12415;
} else
{return null;
}
}
}})();if(cljs.core.keyword_identical_QMARK_.call(null,ret_value__6179__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
var G__12446 = state_12376;
state_12376 = G__12446;
continue;
}
} else
{return ret_value__6179__auto__;
}
break;
}
});
state_machine__6178__auto__ = function(state_12376){
switch(arguments.length){
case 0:
return state_machine__6178__auto____0.call(this);
case 1:
return state_machine__6178__auto____1.call(this,state_12376);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$0 = state_machine__6178__auto____0;
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$1 = state_machine__6178__auto____1;
return state_machine__6178__auto__;
})()
;})(switch__6177__auto__))
})();var state__6194__auto__ = (function (){var statearr_12417 = f__6193__auto__.call(null);(statearr_12417[cljs.core.async.impl.ioc_helpers.USER_START_IDX] = c__6192__auto___12418);
return statearr_12417;
})();return cljs.core.async.impl.ioc_helpers.run_state_machine_wrapped.call(null,state__6194__auto__);
}));
return m;
});
/**
* Adds ch as an input to the mix
*/
cljs.core.async.admix = (function admix(mix,ch){return cljs.core.async.admix_STAR_.call(null,mix,ch);
});
/**
* Removes ch as an input to the mix
*/
cljs.core.async.unmix = (function unmix(mix,ch){return cljs.core.async.unmix_STAR_.call(null,mix,ch);
});
/**
* removes all inputs from the mix
*/
cljs.core.async.unmix_all = (function unmix_all(mix){return cljs.core.async.unmix_all_STAR_.call(null,mix);
});
/**
* Atomically sets the state(s) of one or more channels in a mix. The
* state map is a map of channels -> channel-state-map. A
* channel-state-map is a map of attrs -> boolean, where attr is one or
* more of :mute, :pause or :solo. Any states supplied are merged with
* the current state.
* 
* Note that channels can be added to a mix via toggle, which can be
* used to add channels in a particular (e.g. paused) state.
*/
cljs.core.async.toggle = (function toggle(mix,state_map){return cljs.core.async.toggle_STAR_.call(null,mix,state_map);
});
/**
* Sets the solo mode of the mix. mode must be one of :mute or :pause
*/
cljs.core.async.solo_mode = (function solo_mode(mix,mode){return cljs.core.async.solo_mode_STAR_.call(null,mix,mode);
});
cljs.core.async.Pub = (function (){var obj12448 = {};return obj12448;
})();
cljs.core.async.sub_STAR_ = (function sub_STAR_(p,v,ch,close_QMARK_){if((function (){var and__3431__auto__ = p;if(and__3431__auto__)
{return p.cljs$core$async$Pub$sub_STAR_$arity$4;
} else
{return and__3431__auto__;
}
})())
{return p.cljs$core$async$Pub$sub_STAR_$arity$4(p,v,ch,close_QMARK_);
} else
{var x__4070__auto__ = (((p == null))?null:p);return (function (){var or__3443__auto__ = (cljs.core.async.sub_STAR_[goog.typeOf(x__4070__auto__)]);if(or__3443__auto__)
{return or__3443__auto__;
} else
{var or__3443__auto____$1 = (cljs.core.async.sub_STAR_["_"]);if(or__3443__auto____$1)
{return or__3443__auto____$1;
} else
{throw cljs.core.missing_protocol.call(null,"Pub.sub*",p);
}
}
})().call(null,p,v,ch,close_QMARK_);
}
});
cljs.core.async.unsub_STAR_ = (function unsub_STAR_(p,v,ch){if((function (){var and__3431__auto__ = p;if(and__3431__auto__)
{return p.cljs$core$async$Pub$unsub_STAR_$arity$3;
} else
{return and__3431__auto__;
}
})())
{return p.cljs$core$async$Pub$unsub_STAR_$arity$3(p,v,ch);
} else
{var x__4070__auto__ = (((p == null))?null:p);return (function (){var or__3443__auto__ = (cljs.core.async.unsub_STAR_[goog.typeOf(x__4070__auto__)]);if(or__3443__auto__)
{return or__3443__auto__;
} else
{var or__3443__auto____$1 = (cljs.core.async.unsub_STAR_["_"]);if(or__3443__auto____$1)
{return or__3443__auto____$1;
} else
{throw cljs.core.missing_protocol.call(null,"Pub.unsub*",p);
}
}
})().call(null,p,v,ch);
}
});
cljs.core.async.unsub_all_STAR_ = (function() {
var unsub_all_STAR_ = null;
var unsub_all_STAR___1 = (function (p){if((function (){var and__3431__auto__ = p;if(and__3431__auto__)
{return p.cljs$core$async$Pub$unsub_all_STAR_$arity$1;
} else
{return and__3431__auto__;
}
})())
{return p.cljs$core$async$Pub$unsub_all_STAR_$arity$1(p);
} else
{var x__4070__auto__ = (((p == null))?null:p);return (function (){var or__3443__auto__ = (cljs.core.async.unsub_all_STAR_[goog.typeOf(x__4070__auto__)]);if(or__3443__auto__)
{return or__3443__auto__;
} else
{var or__3443__auto____$1 = (cljs.core.async.unsub_all_STAR_["_"]);if(or__3443__auto____$1)
{return or__3443__auto____$1;
} else
{throw cljs.core.missing_protocol.call(null,"Pub.unsub-all*",p);
}
}
})().call(null,p);
}
});
var unsub_all_STAR___2 = (function (p,v){if((function (){var and__3431__auto__ = p;if(and__3431__auto__)
{return p.cljs$core$async$Pub$unsub_all_STAR_$arity$2;
} else
{return and__3431__auto__;
}
})())
{return p.cljs$core$async$Pub$unsub_all_STAR_$arity$2(p,v);
} else
{var x__4070__auto__ = (((p == null))?null:p);return (function (){var or__3443__auto__ = (cljs.core.async.unsub_all_STAR_[goog.typeOf(x__4070__auto__)]);if(or__3443__auto__)
{return or__3443__auto__;
} else
{var or__3443__auto____$1 = (cljs.core.async.unsub_all_STAR_["_"]);if(or__3443__auto____$1)
{return or__3443__auto____$1;
} else
{throw cljs.core.missing_protocol.call(null,"Pub.unsub-all*",p);
}
}
})().call(null,p,v);
}
});
unsub_all_STAR_ = function(p,v){
switch(arguments.length){
case 1:
return unsub_all_STAR___1.call(this,p);
case 2:
return unsub_all_STAR___2.call(this,p,v);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
unsub_all_STAR_.cljs$core$IFn$_invoke$arity$1 = unsub_all_STAR___1;
unsub_all_STAR_.cljs$core$IFn$_invoke$arity$2 = unsub_all_STAR___2;
return unsub_all_STAR_;
})()
;
/**
* Creates and returns a pub(lication) of the supplied channel,
* partitioned into topics by the topic-fn. topic-fn will be applied to
* each value on the channel and the result will determine the 'topic'
* on which that value will be put. Channels can be subscribed to
* receive copies of topics using 'sub', and unsubscribed using
* 'unsub'. Each topic will be handled by an internal mult on a
* dedicated channel. By default these internal channels are
* unbuffered, but a buf-fn can be supplied which, given a topic,
* creates a buffer with desired properties.
* 
* Each item is distributed to all subs in parallel and synchronously,
* i.e. each sub must accept before the next item is distributed. Use
* buffering/windowing to prevent slow subs from holding up the pub.
* 
* Items received when there are no matching subs get dropped.
* 
* Note that if buf-fns are used then each topic is handled
* asynchronously, i.e. if a channel is subscribed to more than one
* topic it should not expect them to be interleaved identically with
* the source.
*/
cljs.core.async.pub = (function() {
var pub = null;
var pub__2 = (function (ch,topic_fn){return pub.call(null,ch,topic_fn,cljs.core.constantly.call(null,null));
});
var pub__3 = (function (ch,topic_fn,buf_fn){var mults = cljs.core.atom.call(null,cljs.core.PersistentArrayMap.EMPTY);var ensure_mult = ((function (mults){
return (function (topic){var or__3443__auto__ = cljs.core.get.call(null,cljs.core.deref.call(null,mults),topic);if(cljs.core.truth_(or__3443__auto__))
{return or__3443__auto__;
} else
{return cljs.core.get.call(null,cljs.core.swap_BANG_.call(null,mults,((function (or__3443__auto__,mults){
return (function (p1__12449_SHARP_){if(cljs.core.truth_(p1__12449_SHARP_.call(null,topic)))
{return p1__12449_SHARP_;
} else
{return cljs.core.assoc.call(null,p1__12449_SHARP_,topic,cljs.core.async.mult.call(null,cljs.core.async.chan.call(null,buf_fn.call(null,topic))));
}
});})(or__3443__auto__,mults))
),topic);
}
});})(mults))
;var p = (function (){if(typeof cljs.core.async.t12574 !== 'undefined')
{} else
{
/**
* @constructor
*/
cljs.core.async.t12574 = (function (ensure_mult,mults,buf_fn,topic_fn,ch,pub,meta12575){
this.ensure_mult = ensure_mult;
this.mults = mults;
this.buf_fn = buf_fn;
this.topic_fn = topic_fn;
this.ch = ch;
this.pub = pub;
this.meta12575 = meta12575;
this.cljs$lang$protocol_mask$partition1$ = 0;
this.cljs$lang$protocol_mask$partition0$ = 393216;
})
cljs.core.async.t12574.cljs$lang$type = true;
cljs.core.async.t12574.cljs$lang$ctorStr = "cljs.core.async/t12574";
cljs.core.async.t12574.cljs$lang$ctorPrWriter = ((function (mults,ensure_mult){
return (function (this__4010__auto__,writer__4011__auto__,opt__4012__auto__){return cljs.core._write.call(null,writer__4011__auto__,"cljs.core.async/t12574");
});})(mults,ensure_mult))
;
cljs.core.async.t12574.prototype.cljs$core$async$Pub$ = true;
cljs.core.async.t12574.prototype.cljs$core$async$Pub$sub_STAR_$arity$4 = ((function (mults,ensure_mult){
return (function (p,topic,ch__$2,close_QMARK_){var self__ = this;
var p__$1 = this;var m = self__.ensure_mult.call(null,topic);return cljs.core.async.tap.call(null,m,ch__$2,close_QMARK_);
});})(mults,ensure_mult))
;
cljs.core.async.t12574.prototype.cljs$core$async$Pub$unsub_STAR_$arity$3 = ((function (mults,ensure_mult){
return (function (p,topic,ch__$2){var self__ = this;
var p__$1 = this;var temp__4092__auto__ = cljs.core.get.call(null,cljs.core.deref.call(null,self__.mults),topic);if(cljs.core.truth_(temp__4092__auto__))
{var m = temp__4092__auto__;return cljs.core.async.untap.call(null,m,ch__$2);
} else
{return null;
}
});})(mults,ensure_mult))
;
cljs.core.async.t12574.prototype.cljs$core$async$Pub$unsub_all_STAR_$arity$1 = ((function (mults,ensure_mult){
return (function (_){var self__ = this;
var ___$1 = this;return cljs.core.reset_BANG_.call(null,self__.mults,cljs.core.PersistentArrayMap.EMPTY);
});})(mults,ensure_mult))
;
cljs.core.async.t12574.prototype.cljs$core$async$Pub$unsub_all_STAR_$arity$2 = ((function (mults,ensure_mult){
return (function (_,topic){var self__ = this;
var ___$1 = this;return cljs.core.swap_BANG_.call(null,self__.mults,cljs.core.dissoc,topic);
});})(mults,ensure_mult))
;
cljs.core.async.t12574.prototype.cljs$core$async$Mux$ = true;
cljs.core.async.t12574.prototype.cljs$core$async$Mux$muxch_STAR_$arity$1 = ((function (mults,ensure_mult){
return (function (_){var self__ = this;
var ___$1 = this;return self__.ch;
});})(mults,ensure_mult))
;
cljs.core.async.t12574.prototype.cljs$core$IMeta$_meta$arity$1 = ((function (mults,ensure_mult){
return (function (_12576){var self__ = this;
var _12576__$1 = this;return self__.meta12575;
});})(mults,ensure_mult))
;
cljs.core.async.t12574.prototype.cljs$core$IWithMeta$_with_meta$arity$2 = ((function (mults,ensure_mult){
return (function (_12576,meta12575__$1){var self__ = this;
var _12576__$1 = this;return (new cljs.core.async.t12574(self__.ensure_mult,self__.mults,self__.buf_fn,self__.topic_fn,self__.ch,self__.pub,meta12575__$1));
});})(mults,ensure_mult))
;
cljs.core.async.__GT_t12574 = ((function (mults,ensure_mult){
return (function __GT_t12574(ensure_mult__$1,mults__$1,buf_fn__$1,topic_fn__$1,ch__$1,pub__$1,meta12575){return (new cljs.core.async.t12574(ensure_mult__$1,mults__$1,buf_fn__$1,topic_fn__$1,ch__$1,pub__$1,meta12575));
});})(mults,ensure_mult))
;
}
return (new cljs.core.async.t12574(ensure_mult,mults,buf_fn,topic_fn,ch,pub,null));
})();var c__6192__auto___12698 = cljs.core.async.chan.call(null,1);cljs.core.async.impl.dispatch.run.call(null,(function (){var f__6193__auto__ = (function (){var switch__6177__auto__ = (function (state_12650){var state_val_12651 = (state_12650[1]);if((state_val_12651 === 1))
{var state_12650__$1 = state_12650;var statearr_12652_12699 = state_12650__$1;(statearr_12652_12699[2] = null);
(statearr_12652_12699[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12651 === 2))
{var state_12650__$1 = state_12650;return cljs.core.async.impl.ioc_helpers.take_BANG_.call(null,state_12650__$1,4,ch);
} else
{if((state_val_12651 === 3))
{var inst_12648 = (state_12650[2]);var state_12650__$1 = state_12650;return cljs.core.async.impl.ioc_helpers.return_chan.call(null,state_12650__$1,inst_12648);
} else
{if((state_val_12651 === 4))
{var inst_12579 = (state_12650[7]);var inst_12579__$1 = (state_12650[2]);var inst_12580 = (inst_12579__$1 == null);var state_12650__$1 = (function (){var statearr_12653 = state_12650;(statearr_12653[7] = inst_12579__$1);
return statearr_12653;
})();if(cljs.core.truth_(inst_12580))
{var statearr_12654_12700 = state_12650__$1;(statearr_12654_12700[1] = 5);
} else
{var statearr_12655_12701 = state_12650__$1;(statearr_12655_12701[1] = 6);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12651 === 5))
{var inst_12586 = cljs.core.deref.call(null,mults);var inst_12587 = cljs.core.vals.call(null,inst_12586);var inst_12588 = cljs.core.seq.call(null,inst_12587);var inst_12589 = inst_12588;var inst_12590 = null;var inst_12591 = 0;var inst_12592 = 0;var state_12650__$1 = (function (){var statearr_12656 = state_12650;(statearr_12656[8] = inst_12589);
(statearr_12656[9] = inst_12592);
(statearr_12656[10] = inst_12591);
(statearr_12656[11] = inst_12590);
return statearr_12656;
})();var statearr_12657_12702 = state_12650__$1;(statearr_12657_12702[2] = null);
(statearr_12657_12702[1] = 8);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12651 === 6))
{var inst_12579 = (state_12650[7]);var inst_12627 = (state_12650[12]);var inst_12629 = (state_12650[13]);var inst_12627__$1 = topic_fn.call(null,inst_12579);var inst_12628 = cljs.core.deref.call(null,mults);var inst_12629__$1 = cljs.core.get.call(null,inst_12628,inst_12627__$1);var state_12650__$1 = (function (){var statearr_12658 = state_12650;(statearr_12658[12] = inst_12627__$1);
(statearr_12658[13] = inst_12629__$1);
return statearr_12658;
})();if(cljs.core.truth_(inst_12629__$1))
{var statearr_12659_12703 = state_12650__$1;(statearr_12659_12703[1] = 19);
} else
{var statearr_12660_12704 = state_12650__$1;(statearr_12660_12704[1] = 20);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12651 === 7))
{var inst_12646 = (state_12650[2]);var state_12650__$1 = state_12650;var statearr_12661_12705 = state_12650__$1;(statearr_12661_12705[2] = inst_12646);
(statearr_12661_12705[1] = 3);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12651 === 8))
{var inst_12592 = (state_12650[9]);var inst_12591 = (state_12650[10]);var inst_12594 = (inst_12592 < inst_12591);var inst_12595 = inst_12594;var state_12650__$1 = state_12650;if(cljs.core.truth_(inst_12595))
{var statearr_12665_12706 = state_12650__$1;(statearr_12665_12706[1] = 10);
} else
{var statearr_12666_12707 = state_12650__$1;(statearr_12666_12707[1] = 11);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12651 === 9))
{var inst_12625 = (state_12650[2]);var state_12650__$1 = state_12650;var statearr_12667_12708 = state_12650__$1;(statearr_12667_12708[2] = inst_12625);
(statearr_12667_12708[1] = 7);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12651 === 10))
{var inst_12589 = (state_12650[8]);var inst_12592 = (state_12650[9]);var inst_12591 = (state_12650[10]);var inst_12590 = (state_12650[11]);var inst_12597 = cljs.core._nth.call(null,inst_12590,inst_12592);var inst_12598 = cljs.core.async.muxch_STAR_.call(null,inst_12597);var inst_12599 = cljs.core.async.close_BANG_.call(null,inst_12598);var inst_12600 = (inst_12592 + 1);var tmp12662 = inst_12589;var tmp12663 = inst_12591;var tmp12664 = inst_12590;var inst_12589__$1 = tmp12662;var inst_12590__$1 = tmp12664;var inst_12591__$1 = tmp12663;var inst_12592__$1 = inst_12600;var state_12650__$1 = (function (){var statearr_12668 = state_12650;(statearr_12668[14] = inst_12599);
(statearr_12668[8] = inst_12589__$1);
(statearr_12668[9] = inst_12592__$1);
(statearr_12668[10] = inst_12591__$1);
(statearr_12668[11] = inst_12590__$1);
return statearr_12668;
})();var statearr_12669_12709 = state_12650__$1;(statearr_12669_12709[2] = null);
(statearr_12669_12709[1] = 8);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12651 === 11))
{var inst_12589 = (state_12650[8]);var inst_12603 = (state_12650[15]);var inst_12603__$1 = cljs.core.seq.call(null,inst_12589);var state_12650__$1 = (function (){var statearr_12670 = state_12650;(statearr_12670[15] = inst_12603__$1);
return statearr_12670;
})();if(inst_12603__$1)
{var statearr_12671_12710 = state_12650__$1;(statearr_12671_12710[1] = 13);
} else
{var statearr_12672_12711 = state_12650__$1;(statearr_12672_12711[1] = 14);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12651 === 12))
{var inst_12623 = (state_12650[2]);var state_12650__$1 = state_12650;var statearr_12673_12712 = state_12650__$1;(statearr_12673_12712[2] = inst_12623);
(statearr_12673_12712[1] = 9);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12651 === 13))
{var inst_12603 = (state_12650[15]);var inst_12605 = cljs.core.chunked_seq_QMARK_.call(null,inst_12603);var state_12650__$1 = state_12650;if(inst_12605)
{var statearr_12674_12713 = state_12650__$1;(statearr_12674_12713[1] = 16);
} else
{var statearr_12675_12714 = state_12650__$1;(statearr_12675_12714[1] = 17);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12651 === 14))
{var state_12650__$1 = state_12650;var statearr_12676_12715 = state_12650__$1;(statearr_12676_12715[2] = null);
(statearr_12676_12715[1] = 15);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12651 === 15))
{var inst_12621 = (state_12650[2]);var state_12650__$1 = state_12650;var statearr_12677_12716 = state_12650__$1;(statearr_12677_12716[2] = inst_12621);
(statearr_12677_12716[1] = 12);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12651 === 16))
{var inst_12603 = (state_12650[15]);var inst_12607 = cljs.core.chunk_first.call(null,inst_12603);var inst_12608 = cljs.core.chunk_rest.call(null,inst_12603);var inst_12609 = cljs.core.count.call(null,inst_12607);var inst_12589 = inst_12608;var inst_12590 = inst_12607;var inst_12591 = inst_12609;var inst_12592 = 0;var state_12650__$1 = (function (){var statearr_12678 = state_12650;(statearr_12678[8] = inst_12589);
(statearr_12678[9] = inst_12592);
(statearr_12678[10] = inst_12591);
(statearr_12678[11] = inst_12590);
return statearr_12678;
})();var statearr_12679_12717 = state_12650__$1;(statearr_12679_12717[2] = null);
(statearr_12679_12717[1] = 8);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12651 === 17))
{var inst_12603 = (state_12650[15]);var inst_12612 = cljs.core.first.call(null,inst_12603);var inst_12613 = cljs.core.async.muxch_STAR_.call(null,inst_12612);var inst_12614 = cljs.core.async.close_BANG_.call(null,inst_12613);var inst_12615 = cljs.core.next.call(null,inst_12603);var inst_12589 = inst_12615;var inst_12590 = null;var inst_12591 = 0;var inst_12592 = 0;var state_12650__$1 = (function (){var statearr_12680 = state_12650;(statearr_12680[8] = inst_12589);
(statearr_12680[9] = inst_12592);
(statearr_12680[10] = inst_12591);
(statearr_12680[16] = inst_12614);
(statearr_12680[11] = inst_12590);
return statearr_12680;
})();var statearr_12681_12718 = state_12650__$1;(statearr_12681_12718[2] = null);
(statearr_12681_12718[1] = 8);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12651 === 18))
{var inst_12618 = (state_12650[2]);var state_12650__$1 = state_12650;var statearr_12682_12719 = state_12650__$1;(statearr_12682_12719[2] = inst_12618);
(statearr_12682_12719[1] = 15);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12651 === 19))
{var state_12650__$1 = state_12650;var statearr_12683_12720 = state_12650__$1;(statearr_12683_12720[2] = null);
(statearr_12683_12720[1] = 24);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12651 === 20))
{var state_12650__$1 = state_12650;var statearr_12684_12721 = state_12650__$1;(statearr_12684_12721[2] = null);
(statearr_12684_12721[1] = 21);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12651 === 21))
{var inst_12643 = (state_12650[2]);var state_12650__$1 = (function (){var statearr_12685 = state_12650;(statearr_12685[17] = inst_12643);
return statearr_12685;
})();var statearr_12686_12722 = state_12650__$1;(statearr_12686_12722[2] = null);
(statearr_12686_12722[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12651 === 22))
{var inst_12640 = (state_12650[2]);var state_12650__$1 = state_12650;var statearr_12687_12723 = state_12650__$1;(statearr_12687_12723[2] = inst_12640);
(statearr_12687_12723[1] = 21);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12651 === 23))
{var inst_12627 = (state_12650[12]);var inst_12631 = (state_12650[2]);var inst_12632 = cljs.core.swap_BANG_.call(null,mults,cljs.core.dissoc,inst_12627);var state_12650__$1 = (function (){var statearr_12688 = state_12650;(statearr_12688[18] = inst_12631);
return statearr_12688;
})();var statearr_12689_12724 = state_12650__$1;(statearr_12689_12724[2] = inst_12632);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_12650__$1);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12651 === 24))
{var inst_12579 = (state_12650[7]);var inst_12629 = (state_12650[13]);var _ = cljs.core.async.impl.ioc_helpers.add_exception_frame.call(null,state_12650,23,Object,null,22);var inst_12636 = cljs.core.async.muxch_STAR_.call(null,inst_12629);var state_12650__$1 = state_12650;return cljs.core.async.impl.ioc_helpers.put_BANG_.call(null,state_12650__$1,25,inst_12636,inst_12579);
} else
{if((state_val_12651 === 25))
{var inst_12638 = (state_12650[2]);var state_12650__$1 = state_12650;var statearr_12690_12725 = state_12650__$1;(statearr_12690_12725[2] = inst_12638);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_12650__$1);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{return null;
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
});return ((function (switch__6177__auto__){
return (function() {
var state_machine__6178__auto__ = null;
var state_machine__6178__auto____0 = (function (){var statearr_12694 = [null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null];(statearr_12694[0] = state_machine__6178__auto__);
(statearr_12694[1] = 1);
return statearr_12694;
});
var state_machine__6178__auto____1 = (function (state_12650){while(true){
var ret_value__6179__auto__ = (function (){try{while(true){
var result__6180__auto__ = switch__6177__auto__.call(null,state_12650);if(cljs.core.keyword_identical_QMARK_.call(null,result__6180__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
continue;
}
} else
{return result__6180__auto__;
}
break;
}
}catch (e12695){if((e12695 instanceof Object))
{var ex__6181__auto__ = e12695;var statearr_12696_12726 = state_12650;(statearr_12696_12726[5] = ex__6181__auto__);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_12650);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if(new cljs.core.Keyword(null,"else","else",1017020587))
{throw e12695;
} else
{return null;
}
}
}})();if(cljs.core.keyword_identical_QMARK_.call(null,ret_value__6179__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
var G__12727 = state_12650;
state_12650 = G__12727;
continue;
}
} else
{return ret_value__6179__auto__;
}
break;
}
});
state_machine__6178__auto__ = function(state_12650){
switch(arguments.length){
case 0:
return state_machine__6178__auto____0.call(this);
case 1:
return state_machine__6178__auto____1.call(this,state_12650);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$0 = state_machine__6178__auto____0;
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$1 = state_machine__6178__auto____1;
return state_machine__6178__auto__;
})()
;})(switch__6177__auto__))
})();var state__6194__auto__ = (function (){var statearr_12697 = f__6193__auto__.call(null);(statearr_12697[cljs.core.async.impl.ioc_helpers.USER_START_IDX] = c__6192__auto___12698);
return statearr_12697;
})();return cljs.core.async.impl.ioc_helpers.run_state_machine_wrapped.call(null,state__6194__auto__);
}));
return p;
});
pub = function(ch,topic_fn,buf_fn){
switch(arguments.length){
case 2:
return pub__2.call(this,ch,topic_fn);
case 3:
return pub__3.call(this,ch,topic_fn,buf_fn);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
pub.cljs$core$IFn$_invoke$arity$2 = pub__2;
pub.cljs$core$IFn$_invoke$arity$3 = pub__3;
return pub;
})()
;
/**
* Subscribes a channel to a topic of a pub.
* 
* By default the channel will be closed when the source closes,
* but can be determined by the close? parameter.
*/
cljs.core.async.sub = (function() {
var sub = null;
var sub__3 = (function (p,topic,ch){return sub.call(null,p,topic,ch,true);
});
var sub__4 = (function (p,topic,ch,close_QMARK_){return cljs.core.async.sub_STAR_.call(null,p,topic,ch,close_QMARK_);
});
sub = function(p,topic,ch,close_QMARK_){
switch(arguments.length){
case 3:
return sub__3.call(this,p,topic,ch);
case 4:
return sub__4.call(this,p,topic,ch,close_QMARK_);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
sub.cljs$core$IFn$_invoke$arity$3 = sub__3;
sub.cljs$core$IFn$_invoke$arity$4 = sub__4;
return sub;
})()
;
/**
* Unsubscribes a channel from a topic of a pub
*/
cljs.core.async.unsub = (function unsub(p,topic,ch){return cljs.core.async.unsub_STAR_.call(null,p,topic,ch);
});
/**
* Unsubscribes all channels from a pub, or a topic of a pub
*/
cljs.core.async.unsub_all = (function() {
var unsub_all = null;
var unsub_all__1 = (function (p){return cljs.core.async.unsub_all_STAR_.call(null,p);
});
var unsub_all__2 = (function (p,topic){return cljs.core.async.unsub_all_STAR_.call(null,p,topic);
});
unsub_all = function(p,topic){
switch(arguments.length){
case 1:
return unsub_all__1.call(this,p);
case 2:
return unsub_all__2.call(this,p,topic);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
unsub_all.cljs$core$IFn$_invoke$arity$1 = unsub_all__1;
unsub_all.cljs$core$IFn$_invoke$arity$2 = unsub_all__2;
return unsub_all;
})()
;
/**
* Takes a function and a collection of source channels, and returns a
* channel which contains the values produced by applying f to the set
* of first items taken from each source channel, followed by applying
* f to the set of second items from each channel, until any one of the
* channels is closed, at which point the output channel will be
* closed. The returned channel will be unbuffered by default, or a
* buf-or-n can be supplied
*/
cljs.core.async.map = (function() {
var map = null;
var map__2 = (function (f,chs){return map.call(null,f,chs,null);
});
var map__3 = (function (f,chs,buf_or_n){var chs__$1 = cljs.core.vec.call(null,chs);var out = cljs.core.async.chan.call(null,buf_or_n);var cnt = cljs.core.count.call(null,chs__$1);var rets = cljs.core.object_array.call(null,cnt);var dchan = cljs.core.async.chan.call(null,1);var dctr = cljs.core.atom.call(null,null);var done = cljs.core.mapv.call(null,((function (chs__$1,out,cnt,rets,dchan,dctr){
return (function (i){return ((function (chs__$1,out,cnt,rets,dchan,dctr){
return (function (ret){(rets[i] = ret);
if((cljs.core.swap_BANG_.call(null,dctr,cljs.core.dec) === 0))
{return cljs.core.async.put_BANG_.call(null,dchan,rets.slice(0));
} else
{return null;
}
});
;})(chs__$1,out,cnt,rets,dchan,dctr))
});})(chs__$1,out,cnt,rets,dchan,dctr))
,cljs.core.range.call(null,cnt));var c__6192__auto___12864 = cljs.core.async.chan.call(null,1);cljs.core.async.impl.dispatch.run.call(null,(function (){var f__6193__auto__ = (function (){var switch__6177__auto__ = (function (state_12834){var state_val_12835 = (state_12834[1]);if((state_val_12835 === 1))
{var state_12834__$1 = state_12834;var statearr_12836_12865 = state_12834__$1;(statearr_12836_12865[2] = null);
(statearr_12836_12865[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12835 === 2))
{var inst_12797 = cljs.core.reset_BANG_.call(null,dctr,cnt);var inst_12798 = 0;var state_12834__$1 = (function (){var statearr_12837 = state_12834;(statearr_12837[7] = inst_12797);
(statearr_12837[8] = inst_12798);
return statearr_12837;
})();var statearr_12838_12866 = state_12834__$1;(statearr_12838_12866[2] = null);
(statearr_12838_12866[1] = 4);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12835 === 3))
{var inst_12832 = (state_12834[2]);var state_12834__$1 = state_12834;return cljs.core.async.impl.ioc_helpers.return_chan.call(null,state_12834__$1,inst_12832);
} else
{if((state_val_12835 === 4))
{var inst_12798 = (state_12834[8]);var inst_12800 = (inst_12798 < cnt);var state_12834__$1 = state_12834;if(cljs.core.truth_(inst_12800))
{var statearr_12839_12867 = state_12834__$1;(statearr_12839_12867[1] = 6);
} else
{var statearr_12840_12868 = state_12834__$1;(statearr_12840_12868[1] = 7);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12835 === 5))
{var inst_12818 = (state_12834[2]);var state_12834__$1 = (function (){var statearr_12841 = state_12834;(statearr_12841[9] = inst_12818);
return statearr_12841;
})();return cljs.core.async.impl.ioc_helpers.take_BANG_.call(null,state_12834__$1,12,dchan);
} else
{if((state_val_12835 === 6))
{var state_12834__$1 = state_12834;var statearr_12842_12869 = state_12834__$1;(statearr_12842_12869[2] = null);
(statearr_12842_12869[1] = 11);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12835 === 7))
{var state_12834__$1 = state_12834;var statearr_12843_12870 = state_12834__$1;(statearr_12843_12870[2] = null);
(statearr_12843_12870[1] = 8);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12835 === 8))
{var inst_12816 = (state_12834[2]);var state_12834__$1 = state_12834;var statearr_12844_12871 = state_12834__$1;(statearr_12844_12871[2] = inst_12816);
(statearr_12844_12871[1] = 5);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12835 === 9))
{var inst_12798 = (state_12834[8]);var inst_12811 = (state_12834[2]);var inst_12812 = (inst_12798 + 1);var inst_12798__$1 = inst_12812;var state_12834__$1 = (function (){var statearr_12845 = state_12834;(statearr_12845[10] = inst_12811);
(statearr_12845[8] = inst_12798__$1);
return statearr_12845;
})();var statearr_12846_12872 = state_12834__$1;(statearr_12846_12872[2] = null);
(statearr_12846_12872[1] = 4);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12835 === 10))
{var inst_12802 = (state_12834[2]);var inst_12803 = cljs.core.swap_BANG_.call(null,dctr,cljs.core.dec);var state_12834__$1 = (function (){var statearr_12847 = state_12834;(statearr_12847[11] = inst_12802);
return statearr_12847;
})();var statearr_12848_12873 = state_12834__$1;(statearr_12848_12873[2] = inst_12803);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_12834__$1);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12835 === 11))
{var inst_12798 = (state_12834[8]);var _ = cljs.core.async.impl.ioc_helpers.add_exception_frame.call(null,state_12834,10,Object,null,9);var inst_12807 = chs__$1.call(null,inst_12798);var inst_12808 = done.call(null,inst_12798);var inst_12809 = cljs.core.async.take_BANG_.call(null,inst_12807,inst_12808);var state_12834__$1 = state_12834;var statearr_12849_12874 = state_12834__$1;(statearr_12849_12874[2] = inst_12809);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_12834__$1);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12835 === 12))
{var inst_12820 = (state_12834[12]);var inst_12820__$1 = (state_12834[2]);var inst_12821 = cljs.core.some.call(null,cljs.core.nil_QMARK_,inst_12820__$1);var state_12834__$1 = (function (){var statearr_12850 = state_12834;(statearr_12850[12] = inst_12820__$1);
return statearr_12850;
})();if(cljs.core.truth_(inst_12821))
{var statearr_12851_12875 = state_12834__$1;(statearr_12851_12875[1] = 13);
} else
{var statearr_12852_12876 = state_12834__$1;(statearr_12852_12876[1] = 14);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12835 === 13))
{var inst_12823 = cljs.core.async.close_BANG_.call(null,out);var state_12834__$1 = state_12834;var statearr_12853_12877 = state_12834__$1;(statearr_12853_12877[2] = inst_12823);
(statearr_12853_12877[1] = 15);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12835 === 14))
{var inst_12820 = (state_12834[12]);var inst_12825 = cljs.core.apply.call(null,f,inst_12820);var state_12834__$1 = state_12834;return cljs.core.async.impl.ioc_helpers.put_BANG_.call(null,state_12834__$1,16,out,inst_12825);
} else
{if((state_val_12835 === 15))
{var inst_12830 = (state_12834[2]);var state_12834__$1 = state_12834;var statearr_12854_12878 = state_12834__$1;(statearr_12854_12878[2] = inst_12830);
(statearr_12854_12878[1] = 3);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12835 === 16))
{var inst_12827 = (state_12834[2]);var state_12834__$1 = (function (){var statearr_12855 = state_12834;(statearr_12855[13] = inst_12827);
return statearr_12855;
})();var statearr_12856_12879 = state_12834__$1;(statearr_12856_12879[2] = null);
(statearr_12856_12879[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{return null;
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
});return ((function (switch__6177__auto__){
return (function() {
var state_machine__6178__auto__ = null;
var state_machine__6178__auto____0 = (function (){var statearr_12860 = [null,null,null,null,null,null,null,null,null,null,null,null,null,null];(statearr_12860[0] = state_machine__6178__auto__);
(statearr_12860[1] = 1);
return statearr_12860;
});
var state_machine__6178__auto____1 = (function (state_12834){while(true){
var ret_value__6179__auto__ = (function (){try{while(true){
var result__6180__auto__ = switch__6177__auto__.call(null,state_12834);if(cljs.core.keyword_identical_QMARK_.call(null,result__6180__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
continue;
}
} else
{return result__6180__auto__;
}
break;
}
}catch (e12861){if((e12861 instanceof Object))
{var ex__6181__auto__ = e12861;var statearr_12862_12880 = state_12834;(statearr_12862_12880[5] = ex__6181__auto__);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_12834);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if(new cljs.core.Keyword(null,"else","else",1017020587))
{throw e12861;
} else
{return null;
}
}
}})();if(cljs.core.keyword_identical_QMARK_.call(null,ret_value__6179__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
var G__12881 = state_12834;
state_12834 = G__12881;
continue;
}
} else
{return ret_value__6179__auto__;
}
break;
}
});
state_machine__6178__auto__ = function(state_12834){
switch(arguments.length){
case 0:
return state_machine__6178__auto____0.call(this);
case 1:
return state_machine__6178__auto____1.call(this,state_12834);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$0 = state_machine__6178__auto____0;
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$1 = state_machine__6178__auto____1;
return state_machine__6178__auto__;
})()
;})(switch__6177__auto__))
})();var state__6194__auto__ = (function (){var statearr_12863 = f__6193__auto__.call(null);(statearr_12863[cljs.core.async.impl.ioc_helpers.USER_START_IDX] = c__6192__auto___12864);
return statearr_12863;
})();return cljs.core.async.impl.ioc_helpers.run_state_machine_wrapped.call(null,state__6194__auto__);
}));
return out;
});
map = function(f,chs,buf_or_n){
switch(arguments.length){
case 2:
return map__2.call(this,f,chs);
case 3:
return map__3.call(this,f,chs,buf_or_n);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
map.cljs$core$IFn$_invoke$arity$2 = map__2;
map.cljs$core$IFn$_invoke$arity$3 = map__3;
return map;
})()
;
/**
* Takes a collection of source channels and returns a channel which
* contains all values taken from them. The returned channel will be
* unbuffered by default, or a buf-or-n can be supplied. The channel
* will close after all the source channels have closed.
*/
cljs.core.async.merge = (function() {
var merge = null;
var merge__1 = (function (chs){return merge.call(null,chs,null);
});
var merge__2 = (function (chs,buf_or_n){var out = cljs.core.async.chan.call(null,buf_or_n);var c__6192__auto___12989 = cljs.core.async.chan.call(null,1);cljs.core.async.impl.dispatch.run.call(null,(function (){var f__6193__auto__ = (function (){var switch__6177__auto__ = (function (state_12965){var state_val_12966 = (state_12965[1]);if((state_val_12966 === 1))
{var inst_12936 = cljs.core.vec.call(null,chs);var inst_12937 = inst_12936;var state_12965__$1 = (function (){var statearr_12967 = state_12965;(statearr_12967[7] = inst_12937);
return statearr_12967;
})();var statearr_12968_12990 = state_12965__$1;(statearr_12968_12990[2] = null);
(statearr_12968_12990[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12966 === 2))
{var inst_12937 = (state_12965[7]);var inst_12939 = cljs.core.count.call(null,inst_12937);var inst_12940 = (inst_12939 > 0);var state_12965__$1 = state_12965;if(cljs.core.truth_(inst_12940))
{var statearr_12969_12991 = state_12965__$1;(statearr_12969_12991[1] = 4);
} else
{var statearr_12970_12992 = state_12965__$1;(statearr_12970_12992[1] = 5);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12966 === 3))
{var inst_12963 = (state_12965[2]);var state_12965__$1 = state_12965;return cljs.core.async.impl.ioc_helpers.return_chan.call(null,state_12965__$1,inst_12963);
} else
{if((state_val_12966 === 4))
{var inst_12937 = (state_12965[7]);var state_12965__$1 = state_12965;return cljs.core.async.impl.ioc_helpers.ioc_alts_BANG_.call(null,state_12965__$1,7,inst_12937);
} else
{if((state_val_12966 === 5))
{var inst_12959 = cljs.core.async.close_BANG_.call(null,out);var state_12965__$1 = state_12965;var statearr_12971_12993 = state_12965__$1;(statearr_12971_12993[2] = inst_12959);
(statearr_12971_12993[1] = 6);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12966 === 6))
{var inst_12961 = (state_12965[2]);var state_12965__$1 = state_12965;var statearr_12972_12994 = state_12965__$1;(statearr_12972_12994[2] = inst_12961);
(statearr_12972_12994[1] = 3);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12966 === 7))
{var inst_12944 = (state_12965[8]);var inst_12945 = (state_12965[9]);var inst_12944__$1 = (state_12965[2]);var inst_12945__$1 = cljs.core.nth.call(null,inst_12944__$1,0,null);var inst_12946 = cljs.core.nth.call(null,inst_12944__$1,1,null);var inst_12947 = (inst_12945__$1 == null);var state_12965__$1 = (function (){var statearr_12973 = state_12965;(statearr_12973[8] = inst_12944__$1);
(statearr_12973[10] = inst_12946);
(statearr_12973[9] = inst_12945__$1);
return statearr_12973;
})();if(cljs.core.truth_(inst_12947))
{var statearr_12974_12995 = state_12965__$1;(statearr_12974_12995[1] = 8);
} else
{var statearr_12975_12996 = state_12965__$1;(statearr_12975_12996[1] = 9);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12966 === 8))
{var inst_12944 = (state_12965[8]);var inst_12937 = (state_12965[7]);var inst_12946 = (state_12965[10]);var inst_12945 = (state_12965[9]);var inst_12949 = (function (){var c = inst_12946;var v = inst_12945;var vec__12942 = inst_12944;var cs = inst_12937;return ((function (c,v,vec__12942,cs,inst_12944,inst_12937,inst_12946,inst_12945,state_val_12966){
return (function (p1__12882_SHARP_){return cljs.core.not_EQ_.call(null,c,p1__12882_SHARP_);
});
;})(c,v,vec__12942,cs,inst_12944,inst_12937,inst_12946,inst_12945,state_val_12966))
})();var inst_12950 = cljs.core.filterv.call(null,inst_12949,inst_12937);var inst_12937__$1 = inst_12950;var state_12965__$1 = (function (){var statearr_12976 = state_12965;(statearr_12976[7] = inst_12937__$1);
return statearr_12976;
})();var statearr_12977_12997 = state_12965__$1;(statearr_12977_12997[2] = null);
(statearr_12977_12997[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12966 === 9))
{var inst_12945 = (state_12965[9]);var state_12965__$1 = state_12965;return cljs.core.async.impl.ioc_helpers.put_BANG_.call(null,state_12965__$1,11,out,inst_12945);
} else
{if((state_val_12966 === 10))
{var inst_12957 = (state_12965[2]);var state_12965__$1 = state_12965;var statearr_12979_12998 = state_12965__$1;(statearr_12979_12998[2] = inst_12957);
(statearr_12979_12998[1] = 6);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_12966 === 11))
{var inst_12937 = (state_12965[7]);var inst_12954 = (state_12965[2]);var tmp12978 = inst_12937;var inst_12937__$1 = tmp12978;var state_12965__$1 = (function (){var statearr_12980 = state_12965;(statearr_12980[7] = inst_12937__$1);
(statearr_12980[11] = inst_12954);
return statearr_12980;
})();var statearr_12981_12999 = state_12965__$1;(statearr_12981_12999[2] = null);
(statearr_12981_12999[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{return null;
}
}
}
}
}
}
}
}
}
}
}
});return ((function (switch__6177__auto__){
return (function() {
var state_machine__6178__auto__ = null;
var state_machine__6178__auto____0 = (function (){var statearr_12985 = [null,null,null,null,null,null,null,null,null,null,null,null];(statearr_12985[0] = state_machine__6178__auto__);
(statearr_12985[1] = 1);
return statearr_12985;
});
var state_machine__6178__auto____1 = (function (state_12965){while(true){
var ret_value__6179__auto__ = (function (){try{while(true){
var result__6180__auto__ = switch__6177__auto__.call(null,state_12965);if(cljs.core.keyword_identical_QMARK_.call(null,result__6180__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
continue;
}
} else
{return result__6180__auto__;
}
break;
}
}catch (e12986){if((e12986 instanceof Object))
{var ex__6181__auto__ = e12986;var statearr_12987_13000 = state_12965;(statearr_12987_13000[5] = ex__6181__auto__);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_12965);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if(new cljs.core.Keyword(null,"else","else",1017020587))
{throw e12986;
} else
{return null;
}
}
}})();if(cljs.core.keyword_identical_QMARK_.call(null,ret_value__6179__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
var G__13001 = state_12965;
state_12965 = G__13001;
continue;
}
} else
{return ret_value__6179__auto__;
}
break;
}
});
state_machine__6178__auto__ = function(state_12965){
switch(arguments.length){
case 0:
return state_machine__6178__auto____0.call(this);
case 1:
return state_machine__6178__auto____1.call(this,state_12965);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$0 = state_machine__6178__auto____0;
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$1 = state_machine__6178__auto____1;
return state_machine__6178__auto__;
})()
;})(switch__6177__auto__))
})();var state__6194__auto__ = (function (){var statearr_12988 = f__6193__auto__.call(null);(statearr_12988[cljs.core.async.impl.ioc_helpers.USER_START_IDX] = c__6192__auto___12989);
return statearr_12988;
})();return cljs.core.async.impl.ioc_helpers.run_state_machine_wrapped.call(null,state__6194__auto__);
}));
return out;
});
merge = function(chs,buf_or_n){
switch(arguments.length){
case 1:
return merge__1.call(this,chs);
case 2:
return merge__2.call(this,chs,buf_or_n);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
merge.cljs$core$IFn$_invoke$arity$1 = merge__1;
merge.cljs$core$IFn$_invoke$arity$2 = merge__2;
return merge;
})()
;
/**
* Returns a channel containing the single (collection) result of the
* items taken from the channel conjoined to the supplied
* collection. ch must close before into produces a result.
*/
cljs.core.async.into = (function into(coll,ch){return cljs.core.async.reduce.call(null,cljs.core.conj,coll,ch);
});
/**
* Returns a channel that will return, at most, n items from ch. After n items
* have been returned, or ch has been closed, the return chanel will close.
* 
* The output channel is unbuffered by default, unless buf-or-n is given.
*/
cljs.core.async.take = (function() {
var take = null;
var take__2 = (function (n,ch){return take.call(null,n,ch,null);
});
var take__3 = (function (n,ch,buf_or_n){var out = cljs.core.async.chan.call(null,buf_or_n);var c__6192__auto___13094 = cljs.core.async.chan.call(null,1);cljs.core.async.impl.dispatch.run.call(null,(function (){var f__6193__auto__ = (function (){var switch__6177__auto__ = (function (state_13071){var state_val_13072 = (state_13071[1]);if((state_val_13072 === 1))
{var inst_13048 = 0;var state_13071__$1 = (function (){var statearr_13073 = state_13071;(statearr_13073[7] = inst_13048);
return statearr_13073;
})();var statearr_13074_13095 = state_13071__$1;(statearr_13074_13095[2] = null);
(statearr_13074_13095[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13072 === 2))
{var inst_13048 = (state_13071[7]);var inst_13050 = (inst_13048 < n);var state_13071__$1 = state_13071;if(cljs.core.truth_(inst_13050))
{var statearr_13075_13096 = state_13071__$1;(statearr_13075_13096[1] = 4);
} else
{var statearr_13076_13097 = state_13071__$1;(statearr_13076_13097[1] = 5);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13072 === 3))
{var inst_13068 = (state_13071[2]);var inst_13069 = cljs.core.async.close_BANG_.call(null,out);var state_13071__$1 = (function (){var statearr_13077 = state_13071;(statearr_13077[8] = inst_13068);
return statearr_13077;
})();return cljs.core.async.impl.ioc_helpers.return_chan.call(null,state_13071__$1,inst_13069);
} else
{if((state_val_13072 === 4))
{var state_13071__$1 = state_13071;return cljs.core.async.impl.ioc_helpers.take_BANG_.call(null,state_13071__$1,7,ch);
} else
{if((state_val_13072 === 5))
{var state_13071__$1 = state_13071;var statearr_13078_13098 = state_13071__$1;(statearr_13078_13098[2] = null);
(statearr_13078_13098[1] = 6);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13072 === 6))
{var inst_13066 = (state_13071[2]);var state_13071__$1 = state_13071;var statearr_13079_13099 = state_13071__$1;(statearr_13079_13099[2] = inst_13066);
(statearr_13079_13099[1] = 3);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13072 === 7))
{var inst_13053 = (state_13071[9]);var inst_13053__$1 = (state_13071[2]);var inst_13054 = (inst_13053__$1 == null);var inst_13055 = cljs.core.not.call(null,inst_13054);var state_13071__$1 = (function (){var statearr_13080 = state_13071;(statearr_13080[9] = inst_13053__$1);
return statearr_13080;
})();if(inst_13055)
{var statearr_13081_13100 = state_13071__$1;(statearr_13081_13100[1] = 8);
} else
{var statearr_13082_13101 = state_13071__$1;(statearr_13082_13101[1] = 9);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13072 === 8))
{var inst_13053 = (state_13071[9]);var state_13071__$1 = state_13071;return cljs.core.async.impl.ioc_helpers.put_BANG_.call(null,state_13071__$1,11,out,inst_13053);
} else
{if((state_val_13072 === 9))
{var state_13071__$1 = state_13071;var statearr_13083_13102 = state_13071__$1;(statearr_13083_13102[2] = null);
(statearr_13083_13102[1] = 10);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13072 === 10))
{var inst_13063 = (state_13071[2]);var state_13071__$1 = state_13071;var statearr_13084_13103 = state_13071__$1;(statearr_13084_13103[2] = inst_13063);
(statearr_13084_13103[1] = 6);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13072 === 11))
{var inst_13048 = (state_13071[7]);var inst_13058 = (state_13071[2]);var inst_13059 = (inst_13048 + 1);var inst_13048__$1 = inst_13059;var state_13071__$1 = (function (){var statearr_13085 = state_13071;(statearr_13085[7] = inst_13048__$1);
(statearr_13085[10] = inst_13058);
return statearr_13085;
})();var statearr_13086_13104 = state_13071__$1;(statearr_13086_13104[2] = null);
(statearr_13086_13104[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{return null;
}
}
}
}
}
}
}
}
}
}
}
});return ((function (switch__6177__auto__){
return (function() {
var state_machine__6178__auto__ = null;
var state_machine__6178__auto____0 = (function (){var statearr_13090 = [null,null,null,null,null,null,null,null,null,null,null];(statearr_13090[0] = state_machine__6178__auto__);
(statearr_13090[1] = 1);
return statearr_13090;
});
var state_machine__6178__auto____1 = (function (state_13071){while(true){
var ret_value__6179__auto__ = (function (){try{while(true){
var result__6180__auto__ = switch__6177__auto__.call(null,state_13071);if(cljs.core.keyword_identical_QMARK_.call(null,result__6180__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
continue;
}
} else
{return result__6180__auto__;
}
break;
}
}catch (e13091){if((e13091 instanceof Object))
{var ex__6181__auto__ = e13091;var statearr_13092_13105 = state_13071;(statearr_13092_13105[5] = ex__6181__auto__);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_13071);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if(new cljs.core.Keyword(null,"else","else",1017020587))
{throw e13091;
} else
{return null;
}
}
}})();if(cljs.core.keyword_identical_QMARK_.call(null,ret_value__6179__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
var G__13106 = state_13071;
state_13071 = G__13106;
continue;
}
} else
{return ret_value__6179__auto__;
}
break;
}
});
state_machine__6178__auto__ = function(state_13071){
switch(arguments.length){
case 0:
return state_machine__6178__auto____0.call(this);
case 1:
return state_machine__6178__auto____1.call(this,state_13071);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$0 = state_machine__6178__auto____0;
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$1 = state_machine__6178__auto____1;
return state_machine__6178__auto__;
})()
;})(switch__6177__auto__))
})();var state__6194__auto__ = (function (){var statearr_13093 = f__6193__auto__.call(null);(statearr_13093[cljs.core.async.impl.ioc_helpers.USER_START_IDX] = c__6192__auto___13094);
return statearr_13093;
})();return cljs.core.async.impl.ioc_helpers.run_state_machine_wrapped.call(null,state__6194__auto__);
}));
return out;
});
take = function(n,ch,buf_or_n){
switch(arguments.length){
case 2:
return take__2.call(this,n,ch);
case 3:
return take__3.call(this,n,ch,buf_or_n);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
take.cljs$core$IFn$_invoke$arity$2 = take__2;
take.cljs$core$IFn$_invoke$arity$3 = take__3;
return take;
})()
;
/**
* Returns a channel that will contain values from ch. Consecutive duplicate
* values will be dropped.
* 
* The output channel is unbuffered by default, unless buf-or-n is given.
*/
cljs.core.async.unique = (function() {
var unique = null;
var unique__1 = (function (ch){return unique.call(null,ch,null);
});
var unique__2 = (function (ch,buf_or_n){var out = cljs.core.async.chan.call(null,buf_or_n);var c__6192__auto___13203 = cljs.core.async.chan.call(null,1);cljs.core.async.impl.dispatch.run.call(null,(function (){var f__6193__auto__ = (function (){var switch__6177__auto__ = (function (state_13178){var state_val_13179 = (state_13178[1]);if((state_val_13179 === 1))
{var inst_13155 = null;var state_13178__$1 = (function (){var statearr_13180 = state_13178;(statearr_13180[7] = inst_13155);
return statearr_13180;
})();var statearr_13181_13204 = state_13178__$1;(statearr_13181_13204[2] = null);
(statearr_13181_13204[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13179 === 2))
{var state_13178__$1 = state_13178;return cljs.core.async.impl.ioc_helpers.take_BANG_.call(null,state_13178__$1,4,ch);
} else
{if((state_val_13179 === 3))
{var inst_13175 = (state_13178[2]);var inst_13176 = cljs.core.async.close_BANG_.call(null,out);var state_13178__$1 = (function (){var statearr_13182 = state_13178;(statearr_13182[8] = inst_13175);
return statearr_13182;
})();return cljs.core.async.impl.ioc_helpers.return_chan.call(null,state_13178__$1,inst_13176);
} else
{if((state_val_13179 === 4))
{var inst_13158 = (state_13178[9]);var inst_13158__$1 = (state_13178[2]);var inst_13159 = (inst_13158__$1 == null);var inst_13160 = cljs.core.not.call(null,inst_13159);var state_13178__$1 = (function (){var statearr_13183 = state_13178;(statearr_13183[9] = inst_13158__$1);
return statearr_13183;
})();if(inst_13160)
{var statearr_13184_13205 = state_13178__$1;(statearr_13184_13205[1] = 5);
} else
{var statearr_13185_13206 = state_13178__$1;(statearr_13185_13206[1] = 6);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13179 === 5))
{var inst_13155 = (state_13178[7]);var inst_13158 = (state_13178[9]);var inst_13162 = cljs.core._EQ_.call(null,inst_13158,inst_13155);var state_13178__$1 = state_13178;if(inst_13162)
{var statearr_13186_13207 = state_13178__$1;(statearr_13186_13207[1] = 8);
} else
{var statearr_13187_13208 = state_13178__$1;(statearr_13187_13208[1] = 9);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13179 === 6))
{var state_13178__$1 = state_13178;var statearr_13189_13209 = state_13178__$1;(statearr_13189_13209[2] = null);
(statearr_13189_13209[1] = 7);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13179 === 7))
{var inst_13173 = (state_13178[2]);var state_13178__$1 = state_13178;var statearr_13190_13210 = state_13178__$1;(statearr_13190_13210[2] = inst_13173);
(statearr_13190_13210[1] = 3);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13179 === 8))
{var inst_13155 = (state_13178[7]);var tmp13188 = inst_13155;var inst_13155__$1 = tmp13188;var state_13178__$1 = (function (){var statearr_13191 = state_13178;(statearr_13191[7] = inst_13155__$1);
return statearr_13191;
})();var statearr_13192_13211 = state_13178__$1;(statearr_13192_13211[2] = null);
(statearr_13192_13211[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13179 === 9))
{var inst_13158 = (state_13178[9]);var state_13178__$1 = state_13178;return cljs.core.async.impl.ioc_helpers.put_BANG_.call(null,state_13178__$1,11,out,inst_13158);
} else
{if((state_val_13179 === 10))
{var inst_13170 = (state_13178[2]);var state_13178__$1 = state_13178;var statearr_13193_13212 = state_13178__$1;(statearr_13193_13212[2] = inst_13170);
(statearr_13193_13212[1] = 7);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13179 === 11))
{var inst_13158 = (state_13178[9]);var inst_13167 = (state_13178[2]);var inst_13155 = inst_13158;var state_13178__$1 = (function (){var statearr_13194 = state_13178;(statearr_13194[7] = inst_13155);
(statearr_13194[10] = inst_13167);
return statearr_13194;
})();var statearr_13195_13213 = state_13178__$1;(statearr_13195_13213[2] = null);
(statearr_13195_13213[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{return null;
}
}
}
}
}
}
}
}
}
}
}
});return ((function (switch__6177__auto__){
return (function() {
var state_machine__6178__auto__ = null;
var state_machine__6178__auto____0 = (function (){var statearr_13199 = [null,null,null,null,null,null,null,null,null,null,null];(statearr_13199[0] = state_machine__6178__auto__);
(statearr_13199[1] = 1);
return statearr_13199;
});
var state_machine__6178__auto____1 = (function (state_13178){while(true){
var ret_value__6179__auto__ = (function (){try{while(true){
var result__6180__auto__ = switch__6177__auto__.call(null,state_13178);if(cljs.core.keyword_identical_QMARK_.call(null,result__6180__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
continue;
}
} else
{return result__6180__auto__;
}
break;
}
}catch (e13200){if((e13200 instanceof Object))
{var ex__6181__auto__ = e13200;var statearr_13201_13214 = state_13178;(statearr_13201_13214[5] = ex__6181__auto__);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_13178);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if(new cljs.core.Keyword(null,"else","else",1017020587))
{throw e13200;
} else
{return null;
}
}
}})();if(cljs.core.keyword_identical_QMARK_.call(null,ret_value__6179__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
var G__13215 = state_13178;
state_13178 = G__13215;
continue;
}
} else
{return ret_value__6179__auto__;
}
break;
}
});
state_machine__6178__auto__ = function(state_13178){
switch(arguments.length){
case 0:
return state_machine__6178__auto____0.call(this);
case 1:
return state_machine__6178__auto____1.call(this,state_13178);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$0 = state_machine__6178__auto____0;
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$1 = state_machine__6178__auto____1;
return state_machine__6178__auto__;
})()
;})(switch__6177__auto__))
})();var state__6194__auto__ = (function (){var statearr_13202 = f__6193__auto__.call(null);(statearr_13202[cljs.core.async.impl.ioc_helpers.USER_START_IDX] = c__6192__auto___13203);
return statearr_13202;
})();return cljs.core.async.impl.ioc_helpers.run_state_machine_wrapped.call(null,state__6194__auto__);
}));
return out;
});
unique = function(ch,buf_or_n){
switch(arguments.length){
case 1:
return unique__1.call(this,ch);
case 2:
return unique__2.call(this,ch,buf_or_n);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
unique.cljs$core$IFn$_invoke$arity$1 = unique__1;
unique.cljs$core$IFn$_invoke$arity$2 = unique__2;
return unique;
})()
;
/**
* Returns a channel that will contain vectors of n items taken from ch. The
* final vector in the return channel may be smaller than n if ch closed before
* the vector could be completely filled.
* 
* The output channel is unbuffered by default, unless buf-or-n is given
*/
cljs.core.async.partition = (function() {
var partition = null;
var partition__2 = (function (n,ch){return partition.call(null,n,ch,null);
});
var partition__3 = (function (n,ch,buf_or_n){var out = cljs.core.async.chan.call(null,buf_or_n);var c__6192__auto___13350 = cljs.core.async.chan.call(null,1);cljs.core.async.impl.dispatch.run.call(null,(function (){var f__6193__auto__ = (function (){var switch__6177__auto__ = (function (state_13320){var state_val_13321 = (state_13320[1]);if((state_val_13321 === 1))
{var inst_13283 = (new Array(n));var inst_13284 = inst_13283;var inst_13285 = 0;var state_13320__$1 = (function (){var statearr_13322 = state_13320;(statearr_13322[7] = inst_13285);
(statearr_13322[8] = inst_13284);
return statearr_13322;
})();var statearr_13323_13351 = state_13320__$1;(statearr_13323_13351[2] = null);
(statearr_13323_13351[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13321 === 2))
{var state_13320__$1 = state_13320;return cljs.core.async.impl.ioc_helpers.take_BANG_.call(null,state_13320__$1,4,ch);
} else
{if((state_val_13321 === 3))
{var inst_13318 = (state_13320[2]);var state_13320__$1 = state_13320;return cljs.core.async.impl.ioc_helpers.return_chan.call(null,state_13320__$1,inst_13318);
} else
{if((state_val_13321 === 4))
{var inst_13288 = (state_13320[9]);var inst_13288__$1 = (state_13320[2]);var inst_13289 = (inst_13288__$1 == null);var inst_13290 = cljs.core.not.call(null,inst_13289);var state_13320__$1 = (function (){var statearr_13324 = state_13320;(statearr_13324[9] = inst_13288__$1);
return statearr_13324;
})();if(inst_13290)
{var statearr_13325_13352 = state_13320__$1;(statearr_13325_13352[1] = 5);
} else
{var statearr_13326_13353 = state_13320__$1;(statearr_13326_13353[1] = 6);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13321 === 5))
{var inst_13288 = (state_13320[9]);var inst_13285 = (state_13320[7]);var inst_13284 = (state_13320[8]);var inst_13293 = (state_13320[10]);var inst_13292 = (inst_13284[inst_13285] = inst_13288);var inst_13293__$1 = (inst_13285 + 1);var inst_13294 = (inst_13293__$1 < n);var state_13320__$1 = (function (){var statearr_13327 = state_13320;(statearr_13327[10] = inst_13293__$1);
(statearr_13327[11] = inst_13292);
return statearr_13327;
})();if(cljs.core.truth_(inst_13294))
{var statearr_13328_13354 = state_13320__$1;(statearr_13328_13354[1] = 8);
} else
{var statearr_13329_13355 = state_13320__$1;(statearr_13329_13355[1] = 9);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13321 === 6))
{var inst_13285 = (state_13320[7]);var inst_13306 = (inst_13285 > 0);var state_13320__$1 = state_13320;if(cljs.core.truth_(inst_13306))
{var statearr_13331_13356 = state_13320__$1;(statearr_13331_13356[1] = 12);
} else
{var statearr_13332_13357 = state_13320__$1;(statearr_13332_13357[1] = 13);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13321 === 7))
{var inst_13316 = (state_13320[2]);var state_13320__$1 = state_13320;var statearr_13333_13358 = state_13320__$1;(statearr_13333_13358[2] = inst_13316);
(statearr_13333_13358[1] = 3);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13321 === 8))
{var inst_13284 = (state_13320[8]);var inst_13293 = (state_13320[10]);var tmp13330 = inst_13284;var inst_13284__$1 = tmp13330;var inst_13285 = inst_13293;var state_13320__$1 = (function (){var statearr_13334 = state_13320;(statearr_13334[7] = inst_13285);
(statearr_13334[8] = inst_13284__$1);
return statearr_13334;
})();var statearr_13335_13359 = state_13320__$1;(statearr_13335_13359[2] = null);
(statearr_13335_13359[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13321 === 9))
{var inst_13284 = (state_13320[8]);var inst_13298 = cljs.core.vec.call(null,inst_13284);var state_13320__$1 = state_13320;return cljs.core.async.impl.ioc_helpers.put_BANG_.call(null,state_13320__$1,11,out,inst_13298);
} else
{if((state_val_13321 === 10))
{var inst_13304 = (state_13320[2]);var state_13320__$1 = state_13320;var statearr_13336_13360 = state_13320__$1;(statearr_13336_13360[2] = inst_13304);
(statearr_13336_13360[1] = 7);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13321 === 11))
{var inst_13300 = (state_13320[2]);var inst_13301 = (new Array(n));var inst_13284 = inst_13301;var inst_13285 = 0;var state_13320__$1 = (function (){var statearr_13337 = state_13320;(statearr_13337[7] = inst_13285);
(statearr_13337[8] = inst_13284);
(statearr_13337[12] = inst_13300);
return statearr_13337;
})();var statearr_13338_13361 = state_13320__$1;(statearr_13338_13361[2] = null);
(statearr_13338_13361[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13321 === 12))
{var inst_13284 = (state_13320[8]);var inst_13308 = cljs.core.vec.call(null,inst_13284);var state_13320__$1 = state_13320;return cljs.core.async.impl.ioc_helpers.put_BANG_.call(null,state_13320__$1,15,out,inst_13308);
} else
{if((state_val_13321 === 13))
{var state_13320__$1 = state_13320;var statearr_13339_13362 = state_13320__$1;(statearr_13339_13362[2] = null);
(statearr_13339_13362[1] = 14);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13321 === 14))
{var inst_13313 = (state_13320[2]);var inst_13314 = cljs.core.async.close_BANG_.call(null,out);var state_13320__$1 = (function (){var statearr_13340 = state_13320;(statearr_13340[13] = inst_13313);
return statearr_13340;
})();var statearr_13341_13363 = state_13320__$1;(statearr_13341_13363[2] = inst_13314);
(statearr_13341_13363[1] = 7);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13321 === 15))
{var inst_13310 = (state_13320[2]);var state_13320__$1 = state_13320;var statearr_13342_13364 = state_13320__$1;(statearr_13342_13364[2] = inst_13310);
(statearr_13342_13364[1] = 14);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{return null;
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
});return ((function (switch__6177__auto__){
return (function() {
var state_machine__6178__auto__ = null;
var state_machine__6178__auto____0 = (function (){var statearr_13346 = [null,null,null,null,null,null,null,null,null,null,null,null,null,null];(statearr_13346[0] = state_machine__6178__auto__);
(statearr_13346[1] = 1);
return statearr_13346;
});
var state_machine__6178__auto____1 = (function (state_13320){while(true){
var ret_value__6179__auto__ = (function (){try{while(true){
var result__6180__auto__ = switch__6177__auto__.call(null,state_13320);if(cljs.core.keyword_identical_QMARK_.call(null,result__6180__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
continue;
}
} else
{return result__6180__auto__;
}
break;
}
}catch (e13347){if((e13347 instanceof Object))
{var ex__6181__auto__ = e13347;var statearr_13348_13365 = state_13320;(statearr_13348_13365[5] = ex__6181__auto__);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_13320);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if(new cljs.core.Keyword(null,"else","else",1017020587))
{throw e13347;
} else
{return null;
}
}
}})();if(cljs.core.keyword_identical_QMARK_.call(null,ret_value__6179__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
var G__13366 = state_13320;
state_13320 = G__13366;
continue;
}
} else
{return ret_value__6179__auto__;
}
break;
}
});
state_machine__6178__auto__ = function(state_13320){
switch(arguments.length){
case 0:
return state_machine__6178__auto____0.call(this);
case 1:
return state_machine__6178__auto____1.call(this,state_13320);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$0 = state_machine__6178__auto____0;
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$1 = state_machine__6178__auto____1;
return state_machine__6178__auto__;
})()
;})(switch__6177__auto__))
})();var state__6194__auto__ = (function (){var statearr_13349 = f__6193__auto__.call(null);(statearr_13349[cljs.core.async.impl.ioc_helpers.USER_START_IDX] = c__6192__auto___13350);
return statearr_13349;
})();return cljs.core.async.impl.ioc_helpers.run_state_machine_wrapped.call(null,state__6194__auto__);
}));
return out;
});
partition = function(n,ch,buf_or_n){
switch(arguments.length){
case 2:
return partition__2.call(this,n,ch);
case 3:
return partition__3.call(this,n,ch,buf_or_n);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
partition.cljs$core$IFn$_invoke$arity$2 = partition__2;
partition.cljs$core$IFn$_invoke$arity$3 = partition__3;
return partition;
})()
;
/**
* Returns a channel that will contain vectors of items taken from ch. New
* vectors will be created whenever (f itm) returns a value that differs from
* the previous item's (f itm).
* 
* The output channel is unbuffered, unless buf-or-n is given
*/
cljs.core.async.partition_by = (function() {
var partition_by = null;
var partition_by__2 = (function (f,ch){return partition_by.call(null,f,ch,null);
});
var partition_by__3 = (function (f,ch,buf_or_n){var out = cljs.core.async.chan.call(null,buf_or_n);var c__6192__auto___13509 = cljs.core.async.chan.call(null,1);cljs.core.async.impl.dispatch.run.call(null,(function (){var f__6193__auto__ = (function (){var switch__6177__auto__ = (function (state_13479){var state_val_13480 = (state_13479[1]);if((state_val_13480 === 1))
{var inst_13438 = [];var inst_13439 = inst_13438;var inst_13440 = new cljs.core.Keyword("cljs.core.async","nothing","cljs.core.async/nothing",4382193538);var state_13479__$1 = (function (){var statearr_13481 = state_13479;(statearr_13481[7] = inst_13439);
(statearr_13481[8] = inst_13440);
return statearr_13481;
})();var statearr_13482_13510 = state_13479__$1;(statearr_13482_13510[2] = null);
(statearr_13482_13510[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13480 === 2))
{var state_13479__$1 = state_13479;return cljs.core.async.impl.ioc_helpers.take_BANG_.call(null,state_13479__$1,4,ch);
} else
{if((state_val_13480 === 3))
{var inst_13477 = (state_13479[2]);var state_13479__$1 = state_13479;return cljs.core.async.impl.ioc_helpers.return_chan.call(null,state_13479__$1,inst_13477);
} else
{if((state_val_13480 === 4))
{var inst_13443 = (state_13479[9]);var inst_13443__$1 = (state_13479[2]);var inst_13444 = (inst_13443__$1 == null);var inst_13445 = cljs.core.not.call(null,inst_13444);var state_13479__$1 = (function (){var statearr_13483 = state_13479;(statearr_13483[9] = inst_13443__$1);
return statearr_13483;
})();if(inst_13445)
{var statearr_13484_13511 = state_13479__$1;(statearr_13484_13511[1] = 5);
} else
{var statearr_13485_13512 = state_13479__$1;(statearr_13485_13512[1] = 6);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13480 === 5))
{var inst_13443 = (state_13479[9]);var inst_13440 = (state_13479[8]);var inst_13447 = (state_13479[10]);var inst_13447__$1 = f.call(null,inst_13443);var inst_13448 = cljs.core._EQ_.call(null,inst_13447__$1,inst_13440);var inst_13449 = cljs.core.keyword_identical_QMARK_.call(null,inst_13440,new cljs.core.Keyword("cljs.core.async","nothing","cljs.core.async/nothing",4382193538));var inst_13450 = (inst_13448) || (inst_13449);var state_13479__$1 = (function (){var statearr_13486 = state_13479;(statearr_13486[10] = inst_13447__$1);
return statearr_13486;
})();if(cljs.core.truth_(inst_13450))
{var statearr_13487_13513 = state_13479__$1;(statearr_13487_13513[1] = 8);
} else
{var statearr_13488_13514 = state_13479__$1;(statearr_13488_13514[1] = 9);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13480 === 6))
{var inst_13439 = (state_13479[7]);var inst_13464 = inst_13439.length;var inst_13465 = (inst_13464 > 0);var state_13479__$1 = state_13479;if(cljs.core.truth_(inst_13465))
{var statearr_13490_13515 = state_13479__$1;(statearr_13490_13515[1] = 12);
} else
{var statearr_13491_13516 = state_13479__$1;(statearr_13491_13516[1] = 13);
}
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13480 === 7))
{var inst_13475 = (state_13479[2]);var state_13479__$1 = state_13479;var statearr_13492_13517 = state_13479__$1;(statearr_13492_13517[2] = inst_13475);
(statearr_13492_13517[1] = 3);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13480 === 8))
{var inst_13443 = (state_13479[9]);var inst_13439 = (state_13479[7]);var inst_13447 = (state_13479[10]);var inst_13452 = inst_13439.push(inst_13443);var tmp13489 = inst_13439;var inst_13439__$1 = tmp13489;var inst_13440 = inst_13447;var state_13479__$1 = (function (){var statearr_13493 = state_13479;(statearr_13493[7] = inst_13439__$1);
(statearr_13493[8] = inst_13440);
(statearr_13493[11] = inst_13452);
return statearr_13493;
})();var statearr_13494_13518 = state_13479__$1;(statearr_13494_13518[2] = null);
(statearr_13494_13518[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13480 === 9))
{var inst_13439 = (state_13479[7]);var inst_13455 = cljs.core.vec.call(null,inst_13439);var state_13479__$1 = state_13479;return cljs.core.async.impl.ioc_helpers.put_BANG_.call(null,state_13479__$1,11,out,inst_13455);
} else
{if((state_val_13480 === 10))
{var inst_13462 = (state_13479[2]);var state_13479__$1 = state_13479;var statearr_13495_13519 = state_13479__$1;(statearr_13495_13519[2] = inst_13462);
(statearr_13495_13519[1] = 7);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13480 === 11))
{var inst_13443 = (state_13479[9]);var inst_13447 = (state_13479[10]);var inst_13457 = (state_13479[2]);var inst_13458 = [];var inst_13459 = inst_13458.push(inst_13443);var inst_13439 = inst_13458;var inst_13440 = inst_13447;var state_13479__$1 = (function (){var statearr_13496 = state_13479;(statearr_13496[7] = inst_13439);
(statearr_13496[8] = inst_13440);
(statearr_13496[12] = inst_13459);
(statearr_13496[13] = inst_13457);
return statearr_13496;
})();var statearr_13497_13520 = state_13479__$1;(statearr_13497_13520[2] = null);
(statearr_13497_13520[1] = 2);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13480 === 12))
{var inst_13439 = (state_13479[7]);var inst_13467 = cljs.core.vec.call(null,inst_13439);var state_13479__$1 = state_13479;return cljs.core.async.impl.ioc_helpers.put_BANG_.call(null,state_13479__$1,15,out,inst_13467);
} else
{if((state_val_13480 === 13))
{var state_13479__$1 = state_13479;var statearr_13498_13521 = state_13479__$1;(statearr_13498_13521[2] = null);
(statearr_13498_13521[1] = 14);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13480 === 14))
{var inst_13472 = (state_13479[2]);var inst_13473 = cljs.core.async.close_BANG_.call(null,out);var state_13479__$1 = (function (){var statearr_13499 = state_13479;(statearr_13499[14] = inst_13472);
return statearr_13499;
})();var statearr_13500_13522 = state_13479__$1;(statearr_13500_13522[2] = inst_13473);
(statearr_13500_13522[1] = 7);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if((state_val_13480 === 15))
{var inst_13469 = (state_13479[2]);var state_13479__$1 = state_13479;var statearr_13501_13523 = state_13479__$1;(statearr_13501_13523[2] = inst_13469);
(statearr_13501_13523[1] = 14);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{return null;
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
});return ((function (switch__6177__auto__){
return (function() {
var state_machine__6178__auto__ = null;
var state_machine__6178__auto____0 = (function (){var statearr_13505 = [null,null,null,null,null,null,null,null,null,null,null,null,null,null,null];(statearr_13505[0] = state_machine__6178__auto__);
(statearr_13505[1] = 1);
return statearr_13505;
});
var state_machine__6178__auto____1 = (function (state_13479){while(true){
var ret_value__6179__auto__ = (function (){try{while(true){
var result__6180__auto__ = switch__6177__auto__.call(null,state_13479);if(cljs.core.keyword_identical_QMARK_.call(null,result__6180__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
continue;
}
} else
{return result__6180__auto__;
}
break;
}
}catch (e13506){if((e13506 instanceof Object))
{var ex__6181__auto__ = e13506;var statearr_13507_13524 = state_13479;(statearr_13507_13524[5] = ex__6181__auto__);
cljs.core.async.impl.ioc_helpers.process_exception.call(null,state_13479);
return new cljs.core.Keyword(null,"recur","recur",1122293407);
} else
{if(new cljs.core.Keyword(null,"else","else",1017020587))
{throw e13506;
} else
{return null;
}
}
}})();if(cljs.core.keyword_identical_QMARK_.call(null,ret_value__6179__auto__,new cljs.core.Keyword(null,"recur","recur",1122293407)))
{{
var G__13525 = state_13479;
state_13479 = G__13525;
continue;
}
} else
{return ret_value__6179__auto__;
}
break;
}
});
state_machine__6178__auto__ = function(state_13479){
switch(arguments.length){
case 0:
return state_machine__6178__auto____0.call(this);
case 1:
return state_machine__6178__auto____1.call(this,state_13479);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$0 = state_machine__6178__auto____0;
state_machine__6178__auto__.cljs$core$IFn$_invoke$arity$1 = state_machine__6178__auto____1;
return state_machine__6178__auto__;
})()
;})(switch__6177__auto__))
})();var state__6194__auto__ = (function (){var statearr_13508 = f__6193__auto__.call(null);(statearr_13508[cljs.core.async.impl.ioc_helpers.USER_START_IDX] = c__6192__auto___13509);
return statearr_13508;
})();return cljs.core.async.impl.ioc_helpers.run_state_machine_wrapped.call(null,state__6194__auto__);
}));
return out;
});
partition_by = function(f,ch,buf_or_n){
switch(arguments.length){
case 2:
return partition_by__2.call(this,f,ch);
case 3:
return partition_by__3.call(this,f,ch,buf_or_n);
}
throw(new Error('Invalid arity: ' + arguments.length));
};
partition_by.cljs$core$IFn$_invoke$arity$2 = partition_by__2;
partition_by.cljs$core$IFn$_invoke$arity$3 = partition_by__3;
return partition_by;
})()
;

//# sourceMappingURL=async.js.map