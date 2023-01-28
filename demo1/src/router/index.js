import {createRouter, createWebHashHistory} from 'vue-router'
import Layout from '@/layout'
// const routes = [
//     // {
//     //     path: '/',
//     //     component: import('@/components/HelloWorld.vue')
//     // },
//     {
//         path: '/rate',
//         component: import('@/views/rate.vue')
//     },
//     {
//         path: '/test',
//         component: import('@/layout/sidebar/index.vue')
//     },
// ]

export const constantRoutes = [
    {
        path: '',
        component: Layout,
        hidden: true,
        children: [
            {
                path: '/index',
                component: import('@/components/HelloWorld.vue')
            },
            {
                path: '/rate',
                component: import('@/views/rate.vue')
            },
            {
                path: '/user',
                component: import('@/views/user.vue')
            },
        ]
    },

]

const router = createRouter({
    history: createWebHashHistory(),
    routes: constantRoutes
})

export default router
