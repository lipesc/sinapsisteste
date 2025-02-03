import { createRouter, createHistory } from 'vue-router';
import Login from '@views/Login.vue';
import Lista from '@views/Lista.vue';
import Inclusao from '@view/Inclusao.vue';
import Alteracao from '@view/Alteracao.vue';

const routes = [
	{path: '/', component: Login},
	{path: '/lista', component: Lista},
	{path: '/inclusao', component: Inclusao},
	{path: '/alteracao', component: Alteracao},
	{path: '/visualizar', component: Visualizar}
];

const router = createRouter({
	history: createHistory(),
	routes
});

export default router;
