
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/OrderManager"

import StoreManager from "./components/StoreManager"

import CustomerManager from "./components/CustomerManager"

import MyPage from "./components/MyPage"
import PayManager from "./components/PayManager"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },

            {
                path: '/stores',
                name: 'StoreManager',
                component: StoreManager
            },

            {
                path: '/customers',
                name: 'CustomerManager',
                component: CustomerManager
            },

            {
                path: '/myPages',
                name: 'MyPage',
                component: MyPage
            },
            {
                path: '/pays',
                name: 'PayManager',
                component: PayManager
            },



    ]
})
